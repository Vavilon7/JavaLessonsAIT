package Lessons26;

public class SamsungHeadset extends Headset{
    private  boolean aiVersion;

    public SamsungHeadset(boolean waterresistant,
                          String color,
                          ConnectionType connectionType,
                          String brand,
                          Size size,
                          int soundLevel,
                          boolean hasMicro,
                          ChargingType chargingType,
                          boolean aiVersion) {
        super(waterresistant, color, connectionType, brand, size, soundLevel, hasMicro, chargingType);
        this.aiVersion = aiVersion;
    }

    public boolean isAiVersion() {
        return aiVersion;
    }
}

