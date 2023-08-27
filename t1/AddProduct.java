/*Создать сервис добавления продуктов в Автомат (интерфейс). Сервис должен содержать метод, принимающий на вход автомат и продукт, 
добавляющий продукт в автомат. С помощью обобщения добейтесь того, чтобы в обычный автомат можно было добавлять еду или напитки, а в 
автомат с горячими напитками - горячие напитки
Класс Ордер сделайте типизированным, добавьте возможность создавать заказ с продуктами: 2.1 однотипными 2.2(*) разного типа Внесите 
соответственно изменения в остальной код, где используются объекты заказа
*/
package t1;

// import java.util.Calendar;
// import java.util.GregorianCalendar;
// import java.util.Scanner;

public class AddProduct<T extends Product> {

    private Automat au;
    private T pr;

    public void init(Automat au, T pr){
        this.au = au;
        this.pr = pr;
    }


    public void addPr(T pr, Automat au){
        if (au instanceof HotBeverageAutomat) {
            if (pr instanceof HotBeverage) {
                au.AddProduct(pr);
            } else {
                System.out.println("error");
            }
        } else {
            au.AddProduct(pr);
        }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Name: ");
        // pr.setName(sc.nextLine());
        // System.out.println("Price: ");
        // pr.setPrice(Integer.parseInt(sc.nextLine()));
        // Calendar cal = new GregorianCalendar();
        // System.out.println("Best before year: ");
        // cal.set(Calendar.YEAR, Integer.parseInt(sc.nextLine()));
        // System.out.println("Best before month: ");
        // cal.set(Calendar.MONTH, Integer.parseInt(sc.nextLine()));
        // System.out.println("Best before day: ");
        // cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(sc.nextLine()));
        // pr.setBestBefore(cal);
        // System.out.println("Quantity: ");
        // pr.setQuantity(Integer.parseInt(sc.nextLine()));
        }


    public Automat getAu() {
        return au;
    }
    public void setAu(Automat au) {
        this.au = au;
    }
    public T getPr() {
        return pr;
    }
    public void setPr(T pr) {
        this.pr = pr;
    }

}