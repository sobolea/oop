package t1;

public class HotBeverageAutomat extends Automat {
    // public Product getProduct(String name){
    //     for (Product pr : listProduct) {
    //         if(pr.getName() == name){
    //             pr.setQuantity(pr.getQuantity() - 1);
    //             return pr;
    //         }
    //     }
    //     return null;
    // }

    public Product getProduct(String name, int volume, int temperature){
        for (Product pr : listProduct) {
            if(pr.getName() == name){
                return pr;
            }
        }
        return null;
    }

}
