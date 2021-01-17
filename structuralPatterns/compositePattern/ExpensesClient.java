package structuralPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class ExpensesClient {
    public static void main(String[] args) {
        Manager manager = new Manager("Ankit",2000);
        SalesPerson person1 = new SalesPerson("Rohit",1000, manager);
        SalesPerson person2 = new SalesPerson("Mohit",1000, manager);

        List<Payee> payees = new ArrayList<>();
        payees.add(manager);
        payees.add(person1);
        payees.add(person2);

        SalesTeam team = new SalesTeam("Dev_Team",5000, payees);
        payExpensesToPayees(manager);
        payExpensesToPayees(person1);
        payExpensesToPayees(team);
//        payExpensesToSalesPerson(person1);
//        payExpensesToSalesTeam(team);

    }
    public static void payExpensesToPayees(Payee payee){
        System.out.println("Expenses are paying.....");
        payee.payExpenses();
        System.out.println("Expenses are paid !");
    }
//    public static void payExpensesToSalesPerson(SalesPerson salesPerson){
//        System.out.println("Expenses are paying.....");
//        salesPerson.payExpenses();
//        System.out.println("Expenses are paid !");
//    }
//    public static void payExpensesToSalesTeam(SalesTeam salesTeam){
//        System.out.println("Expenses are paying.....");
//        salesTeam.payExpenses();
//        System.out.println("Expenses are paid !");
//    }

}
