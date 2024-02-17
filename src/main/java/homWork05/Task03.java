package homWork05;

public class Task03 {
    public static void main(String[] args) {
        byte age = 22;
        boolean isCheck = (age >=16) && (age <= 75);
        System.out.println(isCheck);

        if(age >= 16 && age <= 75) {
            System.out.println("Возраст подходит");
            System.out.println(true);
        }
        else {
            System.out.println("Не подходит");
            System.out.println(false);
        }
    }
}

