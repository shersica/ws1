import java.util.ArrayList;
import java.util.Scanner;


public class shoppingCart {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your shopping cart");
        ArrayList <String> cart = new ArrayList<>();

        String input = scan.nextLine();
        input = input.toLowerCase();

        while (!"exit".equals(input)) {
            if (input.startsWith("list"){
                if (cart.isEmpty()){
                    System.out.println("Your cart is empty");
                }
                else{
                    for(int i = 0; i < cart.size(); i++){
                        System.out.println(i+1 + "." + cart.get(i));
                    }
                }

            }
            else if (input.startsWith("add")){
                String item = input.substring(4);
                String[] itemArray = item.split(",");

                for (int i = 0; i < itemArray.length; i++){
                    String item = itemArray[i]
                    if (cart.contains(itemArray[i])){
                        System.out.println(item + " is already in cart");
                    }
                    else{
                        cart.add(itemArray[i];
                    }
                }
            }
            
        }
    }
}