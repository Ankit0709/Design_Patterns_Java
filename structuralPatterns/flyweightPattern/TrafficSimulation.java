package structuralPatterns.flyweightPattern;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TrafficSimulation {

    static ArrayList<Vehicle> vehicles = new ArrayList<>();
    public static void main(String[] args) {
        Runnable createVehicles = () -> createRandomCar();
        Runnable removeVehicles = () -> removeVehicles();

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(createVehicles, 0,3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(removeVehicles,5,5,TimeUnit.SECONDS);
    }
    private static  void createRandomCar(){
        Random random = new Random();
        int vehicleNo =  random.nextInt(2);
        Vehicle vehicle =  VehicleFactory.getVehicle(vehicleNo);
        vehicle.setLocation(random.nextInt(1000), random.nextInt(1000));
        System.out.println("Creating " + vehicle + " of type "+ vehicle.getType() + " and latitude = "
        +vehicle.getLocation()[0]+" and longitude = "+vehicle.getLocation()[1]);
        vehicles.add(vehicle);
    }
    private static void removeVehicles(){
        System.out.println("Removing Vehicle"+ vehicles.get(0));
        vehicles.remove(0);
    }
}
