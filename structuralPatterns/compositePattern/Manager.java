package structuralPatterns.compositePattern;

public class Manager implements  Payee{
    String name;
    int amount;

    public Manager(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void payExpenses(){
        System.out.println(name + " is paying amount Rs. "+amount);
    }

}
