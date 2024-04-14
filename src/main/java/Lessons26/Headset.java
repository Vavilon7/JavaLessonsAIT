package Lessons26;

public class Headset {
    private  boolean waterresistant;

    private String color;

    private ConnectionType connectionType;

    private String brand;

    private Size size;

    private int soundLevel;

    private boolean hasMicro;

    private ChargingType chargingType;

    public Headset(boolean waterresistant, String color, ConnectionType connectionType, String brand, Size size, int soundLevel, boolean hasMicro, ChargingType chargingType) {
        this.waterresistant = waterresistant;
        this.color = color;
        this.connectionType = connectionType;
        this.brand = brand;
        this.size = size;
        this.soundLevel = soundLevel;
        this.hasMicro = hasMicro;
        this.chargingType = chargingType;
    }

    public boolean isWaterresistant() {
        return waterresistant;
    }

    public void setWaterresistant(boolean waterresistant) {
        this.waterresistant = waterresistant;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public boolean isHasMicro() {
        return hasMicro;
    }

    public void setHasMicro(boolean hasMicro) {
        this.hasMicro = hasMicro;
    }

    public ChargingType getChargingType() {
        return chargingType;
    }

    public void setChargingType(ChargingType chargingType) {
        this.chargingType = chargingType;
    }
}

