package creationalpatterns.prototypePattern;

public class RabbitGiver {
    public static void main(String[] args) {
        Person p1=new Person("Rohit");
        Rabbit rabbit=new Rabbit(8, Rabbit.Breed.AMERICAN,p1);
        Rabbit rabbit_copy= rabbit.clone();
//        System.out.println("Age of Rabbit 1 is"+rabbit.getAge());
//        rabbit_copy.setAge(12);
//        System.out.println("Age of Rabbit 2 is"+rabbit_copy.getAge());
        rabbit_copy.getPerson().setName("Mohit");
        System.out.println("Rabbit 1 owner is "+rabbit.getPerson().getName());
        System.out.println("Rabbit 2 owner is "+rabbit_copy.getPerson().getName());

    }

}
