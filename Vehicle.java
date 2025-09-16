import java.util.ArrayList;

public class Vehicle{
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;
    private Invoice invoice;

    private ArrayList<Option>option;

    public Vehicle(String serialNumber, String name, String model, int year,
    String manufacturer, double baseCost){
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
        this.option = new ArrayList<>();
    }

    public String getVehicleInfo() {
        return year + " " + manufacturer + " " + model +
               " (Serial: " + serialNumber + ", Base Cost: " + baseCost + ")";
    }

}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("SN123", "A", "Model X", 2015, "Toyota", 25000);
        System.out.println(v1.getVehicleInfo());
    }
}
