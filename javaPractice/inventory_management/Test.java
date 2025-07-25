class Inventory{
    int itemId;
    String itemName;
    int quantity;
    double price;
    double totalCost ;  

    //non para cons
    Inventory(){
        System.out.println("Inventory item created with default values");
    }

    //para constructor
    Inventory(String itemName, int quantity, double price, int itemId){
        System.out.println("parameterized constructor called");
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.totalCost = quantity * price;

    }

    // copy constructor
    Inventory(Inventory item2){
        System.out.println("copy constructor called!");
        this.itemName = item2.itemName;
        this.totalCost = item2.totalCost;
        this.quantity = item2.quantity;
        this.price = item2.price;
        this.itemId = item2.itemId;
    }

    public void InventoryItem() {
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
}
    
}
public class Test{
    public static void main(String[] args) {
        Inventory item1 = new Inventory("hotpot", 2, 200, 4);
        Inventory item2 = new Inventory(item1);
        
        item1.quantity = 10;

        System.out.println("\nitem1 info");
        item1.InventoryItem();
        System.out.println("\nItem 2 unchanged quantity :"+item2.quantity);
        item2.InventoryItem();










    }
}