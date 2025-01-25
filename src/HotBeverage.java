public class HotBeverage extends Product {

    private int temperature;
    private int volume;
    public HotBeverage(String name, int volume) {
        super(name, volume);
    }

    public HotBeverage(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString(){
        return "HotBeverage{name: " + getName() + ", volume: " + volume + ", temperature = " + temperature + "}";
    }

}
