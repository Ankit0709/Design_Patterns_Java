package creationalpatterns.singletonPattern;

public class ClientSystem {
    public static void main(String[] args) {
        PrintSpooler spooler=PrintSpooler.getInstance();
        System.out.println(spooler.hashCode());

        PrintSpooler spooler2=PrintSpooler.getInstance();
        System.out.println(spooler2.hashCode());
    }
}
