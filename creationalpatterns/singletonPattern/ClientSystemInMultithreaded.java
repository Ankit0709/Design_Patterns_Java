package creationalpatterns.singletonPattern;

public class ClientSystemInMultithreaded {
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{PrintSpooler spooler=PrintSpooler.getInstance();
            System.out.println(spooler.hashCode());
        });

        Thread thread2=new Thread(()->{PrintSpooler spooler=PrintSpooler.getInstance();
            System.out.println(spooler.hashCode());
        });
        thread1.start();
        thread2.start();
    }

}
