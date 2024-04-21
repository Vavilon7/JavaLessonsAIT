package HomWork27;

public class MovieSet {
    public static void main(String[] args) {

        Director misterNic = new Director(" Mister Nic ", " director ", 25);
        misterNic.leads();
        System.out.println();

        CameraOperator operator = new CameraOperator(" Ivan ", " operator ", 15);
        operator.controls();
        System.out.println();

        SoundEngineer soundEngineer = new SoundEngineer(" Инженер ", " запись ", 12);
        soundEngineer.recordSound();
        System.out.println(soundEngineer.getPosition());

    }
}
