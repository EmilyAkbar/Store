public class Item {
    String Category; 
    String Name; 
    int price; 
    int initialhealth; 
    int number; 

    Item(String Category, String Name, int price, int initialhealth, int number){
        this.Category = Category; 
        this.Name = Name; 
        this.price = price; 
        this.initialhealth = initialhealth; 
        this.number = number; 
    
    }

    void print() {
        System.out.print("Category: "); 
        System.out.print(this.Category);
        System.out.print(" Item: "); 
        System.out.print(this.Name);
        System.out.print(" Price: $" + this.price);
        System.out.print(" Number: "); 
        System.out.println(this.number); 
    }

    void healthAffect() {

    }

    void goodHealth() {

    }
}

class Dairy extends Item {

    Dairy(String Name, int price, int number) {
        super("Dairy", Name, price, 40, number);
        //TODO Auto-generated constructor stub
    } 

    @Override
    
    void goodHealth() {
        System.out.println("Health boost!");
    }
    
}

class Meat extends Item {

    Meat(String Name, int price, int number) {
        super("Meat", Name, price, 50, number);
        //TODO Auto-generated constructor stub
    } 
    
    @Override
    
    void goodHealth() {
        System.out.println("Health boost!");
    }
}

class Fruits extends Item {

    Fruits(String Name, int price, int number) {
        super("Fruits", Name, price, 70, number);
        //TODO Auto-generated constructor stub
    } 

    @Override
    
    void goodHealth() {
        System.out.println("Health boost!");
    }
    
}

class Grains extends Item {

    Grains(String Name, int price, int number) {
        super("Grains", Name, price, 30, number);
        //TODO Auto-generated constructor stub
    } 

    @Override
    
    void goodHealth() {
        System.out.println("Health boost!");
    }
    
}


class SugaryFood extends Item {

    SugaryFood(String Name, int price, int number) {
        super("Sugary Foods", Name, price, -20, number);
        //TODO Auto-generated constructor stub
    }

    @Override
    
    void healthAffect() {
        System.out.println("This is bad for you!");
    }


}

class FrozenFood extends Item {

    FrozenFood(String Name, int price, int number) {
        super("Frozen Foods", Name, price, -10, number);
        //TODO Auto-generated constructor stub
    } 

    @Override
    
    void healthAffect() {
        System.out.println("This is bad for you!");
    }
    
}

 




    

