package creationalpatterns.prototypePattern;

public class Rabbit implements  Cloneable{
    public enum Breed{
        HIMALYANS,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH
    }
    //age will be in months
    private int age;
    private Breed breed;
    private Person owner;
    Rabbit(){

    }
    Rabbit(int age,Breed breed,Person owner){
        this.age=age;
        this.breed=breed;
        this.owner=owner;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public Breed getBreed(){
        return breed;
    }
    public void setBreed(Breed breed){
        this.breed=breed;
    }

    public Person getPerson() {
        return owner;
    }

    public void setPerson(String person) {
        Person owner=new Person(person);
        this.owner = owner;
    }

    @Override
    public Rabbit clone(){
        try{
           Rabbit rabbit = (Rabbit) super.clone();
           rabbit.owner = owner.clone();
           return  rabbit;
        }
        catch(CloneNotSupportedException ex){
            throw  new AssertionError();
        }
    }
}
