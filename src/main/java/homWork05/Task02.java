package homWork05;

public class Task02 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        boolean isBetween;

        boolean isBetweenResult = (y > x) && (y < z);
        System.out.println(isBetweenResult);

        // if(x < y && y < z){
        if((x > y && y > z) || (x < y && y < z)){
            isBetween = true;
            System.out.println(isBetween);
        }
        else {
            isBetween = false;
            System.out.println(isBetween);
        }

    }
}
