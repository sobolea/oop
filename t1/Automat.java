package t1;

import java.util.ArrayList;
import java.util.List;

public class Automat {
    List<Product> listProduct = new ArrayList<>();

    public void initProduct(List<Product> myList) {
        listProduct = myList;
    }

    public Product getProduct(String name){
        for (Product pr : listProduct) {
            if(pr.getName() == name){
                pr.setQuantity(pr.getQuantity() - 1);
                return pr;
            }
        }
        return null;
    }

   
}
