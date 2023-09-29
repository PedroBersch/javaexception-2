package application;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        try {

            Account acc = new Account(101, "Pedro", 100.0, 200.0);
            System.out.println(acc.getBalance());
            acc.withdraw(150.00);
            System.out.println(acc.getBalance());
            System.out.println("Exception test");
            acc.withdraw(250.0);
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }
    }


}
