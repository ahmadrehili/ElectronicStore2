package Main;

import java.util.ArrayList;


public class Store {


    private String name;
    private ArrayList<Product> products;
    
    public Store(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(Product product) {
        this.products.add(product);
    }
    
    @Override
    public String toString() {
        String str =  "Store name: " + name +"\n";
        int i=1;
        for(Product p : products)
        {
            str+="\t"+(i++)+". "+(Laptop)p+"\n";
        }
        return str;
    }
    
}
