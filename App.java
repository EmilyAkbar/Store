import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int money = 100; 
        int initialhealth = 0; 
        System.out.println("Hello. Welcome to Java Market. Have fun shopping—but don't forget to watch for you health! "); 

        System.out.println("You have 100 dollars to spend.");
        Store st = new Store();
        st.printitems(); 
        for (Item item: st.items) {
            st.buyItem(item, money, initialhealth);
        }
    }  
}

class Store {
    Scanner sc; 
    ArrayList<Item> items = new ArrayList<Item>();
    Store() {
        items.add(new Item("Dairy", "Milk", 4, 40, 0)); 
        items.add(new Item("Dairy", "Eggs", 8, 50, 1));
        items.add(new Item("Dairy", "Cheese", 8, 30, 2));
        items.add(new Item("Meat", "Chicken", 9, 50, 3));
        items.add(new Item("Meat", "Beef", 15, 50, 4));
        items.add(new Item("Meat", "Fish", 10, 60, 5));
        items.add(new Item("Fruits", "Strawberry", 6, 70, 6));
        items.add(new Item("Fruits","Banana", 3, 70, 7));
        items.add(new Item("Fruits","Orange", 4, 70, 8));
        items.add(new Item("Fruits", "Mango", 4, 70, 9));
        items.add(new Item("Fruits","Broccoli", 4, 70, 10));
        items.add(new Item("Fruits","Tomato", 4, 70, 11));
        items.add(new Item("Fruits","Cucumber", 3, 70, 12));
        items.add(new Item("Fruits","Spinach", 3, 70, 13));
        items.add(new Item("Grains", "Rice", 4, 30, 14));
        items.add(new Item("Grains","Pasta", 4, 30, 15));
        items.add(new Item("Grains","Bread", 3, 40, 16));
        items.add(new Item("Sugary Foods", "Chocolate Bar", 1, -20, 17));
        items.add(new Item("Sugary Foods","Cake", 10, -20, 18));
        items.add(new Item("Sugary Foods", "Soda", 2, -20, 19));
        items.add(new Item("Sugary Foods","Cookie", 2, -20, 20));
        items.add(new Item("Sugary Foods","Donut", 1, -20, 21));
        items.add(new Item("Sugary Foods","Candy", 1, -20, 22));
        items.add(new Item("Sugary Foods","Snackerty Board", 10, -100, 23));
        items.add(new Item("Frozen Foods", "Frozen Pizza",3, -10, 24));
        items.add(new Item("Frozen Foods","Eggos", 3, -10, 25));
        items.add(new Item("Frozen Foods", "Dino Nuggests", 4, -10, 26));
        items.add(new Item("Frozen Foods", "Frozen Mozza Sticks", 4, -10, 27));
    } 
       
    
    void printitems () {
        for(int i =0; i < items.size();i ++ ) {
            Item item = items.get(i);
            item.print();
        }
    } 

    Item buyItem (Item i, int money, int initialhealth) {
        int index;  

        System.out.println("What would you like to buy? Enter: "); 
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt(); 
        Item item = items.get(index);

        //Checks it input is valid ~ fix the error checking 

        try{ 

            if (index > -1 && index < items.size()) {
                item.print(); 
                money= money - i.price; 
                System.out.println("You have $" + money + " left"); 
                initialhealth += i.initialhealth; 
                System.out.println("Your health level: " + initialhealth);

                if (money < 0) {
                    System.out.println("You cannot afford anything else."); 
                    System.out.println("Final health level: " + initialhealth); 
                   }

                else if (money == 0) {
                    System.out.println("You cannot afford anything else."); 
                    System.out.println("Final health level: " + initialhealth); 

                 }
                
                return item;
            }
            
            else {
                System.out.println("This is not a valid input. Please enter a number from 1-28");
                return buyItem(i, money, initialhealth); 
            }
        }
        catch (Exception e) { //
            System.out.println("This is not a valid input. Please enter a number from 1-28");
            return buyItem(i, money, initialhealth); 
        }
            
        }


        
    }

    //There seems to be something wrong when buying a new item, it doesn't account for the previous health and money, so 
    //maybe I should try to store everything in an array list? 