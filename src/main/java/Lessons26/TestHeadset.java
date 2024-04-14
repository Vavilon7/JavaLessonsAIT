package Lessons26;

public class TestHeadset {
    public static void main(String[] args) {
        AppleHeadset appleHeadset = new AppleHeadset(true, "white", ConnectionType.WIRELESS, "Apple",
                Size.SMALL, 70,
                true, ChargingType.INDUCTION, "1.2");
        System.out.println(appleHeadset.getColor());

        SamsungHeadsetExperimental samsungHeadsetExperimental = new SamsungHeadsetExperimental
                (true, "white", ConnectionType.WIRELESS, "Samsung", Size.SMALL, 70,
                        true, ChargingType.INDUCTION, true, 2000);
        System.out.println(samsungHeadsetExperimental.getBrand());
    }
}

