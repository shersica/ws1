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
            if (input.startsWith("list")){
                if (cart.isEmpty()){
                    System.out.println("Your cart is empty");
                }
                else{
                    for(int i = 0; i < cart.size(); i++){
                        System.out.println(i+1 + ". " + cart.get(i));
                    }
                }

            }
            else if (input.startsWith("add")){
                String items = input.substring(4);
                String[] itemArray = items.split(", ", 0);

                for (int i = 0; i < itemArray.length; i++){
                    String item = itemArray[i]; //to be fixed
                    if (cart.contains(itemArray[i])){
                        System.out.println("You have " + item + " in your cart");
                    }
                    else{
                        cart.add(item); 
                        System.out.println(item + " added to cart");
                    }
                }
            }
            else if (input.startsWith("delete")){
                Integer index = Integer.parseInt(input.substring(7));
                System.out.println(index);
                if (index < 1 || index > cart.size()){
                    System.out.println("Invalid index");
                }
                else {
                    String item = cart.get(index-1);
                    cart.remove(item);
                    System.out.println(item + " removed from the cart");
                }
            
            }
            else {
                System.out.println("Invalid command");
            }

            input = scan.nextLine().toLowerCase();
        }
        scan.close();
    }
}