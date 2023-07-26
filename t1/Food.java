package t1;

import java.util.Calendar;

public class Food extends Product {
 
    private Double weight;
    public Food(String name, int price, int quantity, Calendar bestBefore, Double weight){
        super(name, price, quantity, bestBefore);
        this.weight = weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }
   

    public String toString(){
        return super.toString() + " weight: " + weight;
    }
}
