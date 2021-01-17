package structuralPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements  Payee {
    String name;
    int amount;
    List<Payee> payees = new ArrayList<>();


    public SalesTeam(String name, int amount, List<Payee> payees) {
        this.name = name;
        this.amount = amount;
        this.payees = payees;
    }
    public void payExpenses(){
        payees.forEach(payees -> {payees.payExpenses();});

    }
}
