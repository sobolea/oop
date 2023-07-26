package t1;

import java.util.Calendar;

public abstract class Product {
    private String name;
    private Integer price;
    private Integer quantity;
    private Calendar bestBefore;

    public Product(String name, Integer price, Integer quantity, Calendar bestBefore) {
        this.name  = name;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore;
    }

    public void setBestBefore(Calendar bestBefore) {
        this.bestBefore = bestBefore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Calendar getBestBefore() {
        return bestBefore;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "name: " + name +"\nprice: " + price +" quantity: " + quantity +" best before: " + bestBefore.get(Calendar.YEAR) +"/" + bestBefore.get(Calendar.MONTH)+"/" + bestBefore.get(Calendar.DAY_OF_MONTH);
    }
}
