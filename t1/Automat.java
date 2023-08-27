package t1;

import java.util.ArrayList;
import java.util.List;

import oop_java.Order;

public class Automat {
    List<Product> listProduct = new ArrayList<>();

    public void initProduct(List<Product> myList) {
        listProduct = myList;
    }

    public Product getProduct(String name){
        for (Product pr : listProduct) {
            if(pr.getName() == name){
                return pr;
            }
        }
        return null;
    }

    public Order createOrder( ArrayList<Product> shoppingList ){
        List <Product> newList = new ArrayList();
        Integer sumPrices = 0;
        for (Product product : shoppingList){ 
            if (product.getQuantity() > 0 ){
                newList.add(product);  
                sumPrices += product.getPrice();
            }
        } 
        System.out.println(newList);
        Order newOrder = new Order(newList, sumPrices);
        return newOrder;
    }

    public void AddProduct(Product pr){
        listProduct.add(pr);
    }

}
