package Lesson05;

public class Operetors {

    public static void main(String[] args) {
        int numberOne = 10;
        int getNumberTwu = 10;
        //Оператор равенства ==
        boolean isEqual = (numberOne == getNumberTwu);
        System.out.println(isEqual);
        int numberThree = 50;
        int numberFour = 60;

        //Оператор не равенства !=
        System.out.println(numberThree != numberFour);

        // Опеератор больше >
        System.out.println(numberThree > numberFour);

        // оператор  меньше <
        System.out.println(numberThree < numberFour);

        // Оператор больше или равно >=
        System.out.println(numberThree >= numberFour);

        // Оператор меньше или равно <=
        System.out.println(numberThree <= numberFour);

        String nameOne = "Mustermann";
        String nameTwo = "Mustermann";
        boolean pass = true;
        boolean isEqualNameOneNameTwo = nameOne.equals(nameTwo);
        System.out.println(nameOne.equals(nameTwo));


        /*
        AND &&
        false && false --> false
        false && true --> false
        true && false --> false
        true && true --> true

         */
        /*
         OR ||
        false || false --> false
        false || true --> true
        true || false --> true
        true || true --> true
         */
        int age = 20;
        int salary = 10000;
        boolean hasCredit;
        //Банк 1
        if (age >= 21 && salary > 2000 && pass == true) {
            System.out.println("Positiv");
            hasCredit = true;
        } else {
            System.out.println("Negativ");
            hasCredit = false;
        }
        System.out.println("Credit:" + hasCredit);

        //Банк 2
        if (age >= 21 || salary > 3000) {
            hasCredit = true;
        } else {
            hasCredit = false;
        }
        System.out.println("Credit 2:" + hasCredit);
        int numberA = 40;
        int numberB = 20;
        boolean checkResult = false;
         if ( numberA > 10 || numberB > 15) { // false || true --> true
             checkResult = true;
         }
         if (numberA > 10 && numberB > 15 ) { // false && true --> false
             checkResult = false;
         }
         System.out.println("checkResult -->" + checkResult );

         double accountBalance = 50000.0;
         boolean accountActive = true;
         double amountToWithdraw = 6000.0;
         boolean transactionSuccess = false;

         if (accountActive && accountBalance >= amountToWithdraw)
         { accountBalance = accountBalance - amountToWithdraw;
             transactionSuccess = true;
             System.out.println( "Transactions:" + transactionSuccess + "Balance:" + accountBalance);
         }
else {
    transactionSuccess= false;
    System.out.println("ERROR!!!" + transactionSuccess);
    transactionSuccess = true;
    System.out.println("Transaction:" + transactionSuccess + "Balance: " + accountBalance);
         }
System.out.println(transactionSuccess);
    }
}