package t1;

import java.util.Calendar;

public class HotBeverage extends Beverage {
    private int temp;

    public HotBeverage(String name, int price, int quantity, Calendar bestBefore, Double volume, int temp){
        super(name, price, quantity, bestBefore, volume);
        this.temp = temp;
    } 

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String toString() {
        return super.toString() + " temperature: "+ temp;
    }
}
