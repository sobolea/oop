package t1;
// Не понимаю как мы можем получить значение volume, оно же в классе HotBeverage, а у нас список из Product
//Надо создавать ещё один список? Мы никак не можем считать значение volume из класса product?

import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat extends Automat {

    List<Product> newList = new ArrayList<>();

    public void initHotBeverage(List<Product> list){
        newList = list;
    }

    public HotBeverage getProduct(String name, double volume, int temp){
        for (Product pr : newList) {
            if(pr.getName() == name & pr.getVolume() == volume & pr.getTemp() == temp){
                return pr;
            }
        }
        return null;
    }

}
