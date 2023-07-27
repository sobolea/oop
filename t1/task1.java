//Соболевская 4619




/*Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name) */

package t1;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        Product p1 = new Food("limon", 23, 4, new GregorianCalendar(1990, 4, 3), 5.3);
        Product p2 = new Food("apple", 34, 7, new GregorianCalendar(1996, 12, 5), 6.3);
        Product p3 = new Food("orange", 75, 13, new GregorianCalendar(1994, 12, 22), 0.5);
        Product p4 = new Beverage("milk", 33, 43, new GregorianCalendar(1990, 2, 13), 0.9);
        Product p5 = new HotBeverage("Hot chocolate", 70, 22, new GregorianCalendar(2020, 12, 3), 0.3, 90);
        Product p6 = new HotBeverage("Latte", 80, 2, new GregorianCalendar(2020, 2, 6), 0.4, 80);
        Product p7 = new HotBeverage("Cappuchino", 90, 5, new GregorianCalendar(2020, 6, 5), 0.2, 70);

        List<Product> prList = new ArrayList<>();
        prList.add(p1);
        prList.add(p2);
        prList.add(p3);
        prList.add(p4);

        prList.add(p5);
        prList.add(p6);
        prList.add(p7);
        
        Automat list = new Automat();
        list.initProduct(prList);

        HotBeverageAutomat listnew = new HotBeverageAutomat();
        listnew.initProduct(prList);

        // System.out.println((listnew).getProduct("Hot chocolate", 0.3, 9));
        System.out.println((listnew).getProduct("Latte", 0.4, 80));

        // System.out.println(list.getProduct("limon"));

    }
}