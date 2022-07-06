package ru.netology.domain.field;

public class Conditioner {
    private int id;
    private String name = "Netology-Inc";
    private int maxTemperature = 30;
    private int minTemperature = 10;
    private int currentTemperature = calculateCurrentTemp();
    private boolean on;

    private int calculateCurrentTemp() {
        return (maxTemperature + minTemperature) / 2;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getMaxTemperature() {return maxTemperature;}

    public void setMaxTemperature(int maxTemperature) {this.maxTemperature = maxTemperature;}

    public int getMinTemperature() {return minTemperature;}

    public void setMinTemperature(int minTemperature) {this.minTemperature = minTemperature;}

    public int getCurrentTemperature() {return currentTemperature;}

    public void setCurrentTemperature(int currentTemperature) {this.currentTemperature = currentTemperature;}

    public boolean isOn() {return on;}

    public void setOn(boolean on) {this.on = on;}

}
