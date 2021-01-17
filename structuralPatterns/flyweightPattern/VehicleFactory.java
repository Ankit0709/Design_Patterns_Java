package structuralPatterns.flyweightPattern;

import java.util.HashMap;

public class VehicleFactory {
    static HashMap<Integer,Vehicle> vehicles = new HashMap<>();
    static Vehicle getVehicle(int type){
        if(vehicles.containsKey(type)){
            return vehicles.get(type);
        }
        else{
            Vehicle vehicle = null;
            if(type==0){
                vehicle = new Car();
            }
            else{
                vehicle = new Truck();
            }
            vehicles.put(type,vehicle);
            return vehicle;
        }
    }
}
