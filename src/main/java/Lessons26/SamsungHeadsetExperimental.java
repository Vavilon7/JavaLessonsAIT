package Lessons26;

public class SamsungHeadsetExperimental extends SamsungHeadset{
    private int stepcount;

    public SamsungHeadsetExperimental(boolean waterresistant,
                                      String color,
                                      ConnectionType connectionType,
                                      String brand, Size size,
                                      int soundLevel, boolean hasMicro,
                                      ChargingType chargingType,
                                      boolean aiVersion, int stepcount) {
        super(waterresistant, color, connectionType, brand, size, soundLevel, hasMicro, chargingType, aiVersion);
        this.stepcount = stepcount;
    }

    public int getStepcount() {
        return stepcount;
    }
}

