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
}





    

