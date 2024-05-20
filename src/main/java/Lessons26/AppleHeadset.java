package Lessons26;

import Lessons26.ChargingType;
import Lessons26.ConnectionType;
import Lessons26.Headset;
import Lessons26.Size;

public class AppleHeadset extends Headset {
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

