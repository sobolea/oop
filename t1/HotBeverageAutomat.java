package t1;

public class HotBeverageAutomat extends Automat {


    public Product getProduct(String name, double volume, int temp){
        for (Product pr : listProduct) {
            if(pr instanceof HotBeverage & pr.getName() == name & ((HotBeverage) pr).getVolume() == volume & ((HotBeverage) pr).getTemp() == temp){
                return pr;
            }
        }
        return null;
}
    }