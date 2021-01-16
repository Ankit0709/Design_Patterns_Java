package creationalpatterns.singletonPattern;

public class PrintSpooler {
    private static PrintSpooler spooler;
    private static boolean isIntitialized=false;
    private PrintSpooler(){

    }
    private void init(){

    }
    public static  synchronized   PrintSpooler getInstance(){
        if(isIntitialized) return spooler;
        spooler=new PrintSpooler();
        spooler.init();
        isIntitialized=true;
        return spooler;
    }
}
