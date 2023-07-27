package t1;
// Не понимаю почему не проходит проверку в 17 строке

import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat extends Automat {

    List<Product> newList = new ArrayList<>();

    public void initHotBeverage(List<Product> list){
        newList = list;
    }

    public Product getProduct(String name, double volume, int temp){
        for (Product pr : newList) {
            if(pr instanceof HotBeverage & pr.getName() == name & ((HotBeverage) pr).getVolume() == volume & ((HotBeverage) pr).getTemp() == temp){
                return pr;
            }
        }
        return null;
}
    }