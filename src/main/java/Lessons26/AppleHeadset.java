package Lessons26;

public class AppleHeadset extends Headset{
    private String softwareVersion;

    public AppleHeadset(boolean waterresistant,
                        String color, ConnectionType connectionType,
                        String brand, Size size, int soundLevel,
                        boolean hasMicro, ChargingType chargingType,
                        String softwareVersion) {
        super(waterresistant, color, connectionType, brand, size, soundLevel, hasMicro, chargingType);
        this.softwareVersion = softwareVersion;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }
}

