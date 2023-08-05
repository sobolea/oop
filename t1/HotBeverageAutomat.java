package t1;

public class HotBeverageAutomat extends Automat {


    public Product getProduct(String name, double volume, int temp){
        for (Product pr : listProduct) {
            if(pr instanceof HotBeverage && ((HotBeverage) pr).getName().equals(name) && ((HotBeverage) pr).getVolume().equals(volume) && ((HotBeverage) pr).getTemp() == temp){
                return pr;
            }
        }
        return null;
}
    }