import java.util.ArrayList;

public class Customer{
    private int customerID;
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Invoice>invoice;

    public String getCustomerInfo(){
        return this.name+" ID: "+this.customerID+" address: "+this.address+" Tel: "+this.phoneNumber;
    }

}