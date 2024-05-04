package Clients;

import Lessons28.Account;
import Lessons28.CheckingAccount;
import Lessons28.User;

public class TestClient {
    public static void main(String[] args) {
        Account account = new Account( 10000);
        System.out.println( account.getBalance());
       // account.balance = 40000;
        //account.withdraw( 30000);

        //System.out.println(account.getBalance());
        CheckingAccount checkingAccount = new CheckingAccount( 1000 ,500 );
        checkingAccount.withdraw( 1200);
        System.out.println( checkingAccount.getBalance());
    }
}
