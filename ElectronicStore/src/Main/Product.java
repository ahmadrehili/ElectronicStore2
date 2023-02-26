package Main;

public class Product {


    protected String name ;
    protected String company;
    protected double price;

    public Product(String name, String company, double price) {
        this.name = name;
        this.company = company;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Company: " + company +", Price: "+price+"SAR" ;
    }
    
}
