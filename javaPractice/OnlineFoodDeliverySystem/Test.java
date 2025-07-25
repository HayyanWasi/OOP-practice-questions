class FoodItem{
    private double id;
    private String name;
    private double price;
    private double quantityAvaliable;

    FoodItem(double id, String name, double price, double quantityAvaliable){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantityAvaliable=quantityAvaliable;
    }

    public double getId(){
        return id;
    }
    public String name(){
        return name;    
    }
    public double price(){
        return price;    
    }


    public double quantityAvaliable(){
        return quantityAvaliable;
    }

    public void setId(double id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setQuantityAvailable(double quantityAvaliable){
        this.quantityAvaliable=quantityAvaliable;
    }

    public void getDiscountedPrice(double price, double quantityAvaliable){
        if(price<1000){
            quantityAvaliable-=1;   
        }
        thorw new Itemnotav
    }














}

public class Test{
    public static void main(String[] args) {
        
    }
}