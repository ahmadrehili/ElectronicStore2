package Main;

public class Laptop extends Product {

    private String cpu;
    private int RAM;

    public Laptop(String cpu, int RAM, String name, String company, double price) {
        super(name, company, price);
        this.cpu = cpu;
        this.RAM = RAM;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tCPU: " + cpu + ", RAM: " + RAM;
    }

}
