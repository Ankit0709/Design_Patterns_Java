package structuralPatterns.compositePattern;

public class SalesPerson implements  Payee{
    String name;
    int amount;
    Manager manager;

    public SalesPerson(String name, int amount, Manager manager) {
        this.name = name;
        this.amount = amount;
        this.manager = manager;
    }
    public void payExpenses(){
        System.out.println(name + " is paying amount Rs. "+amount);
    }
}
