
enum Laptop{
    Macbook(2000), Dell(1000), Asus(1000), hp(400), Acer;
    private int price;
    private Laptop(){ // use acer laptop.
        price = 410;
    }
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}

public class enum5_WithValue {
    public static void main(String[] args) {
        // Laptop l = Laptop.Macbook;
        // System.out.println(l);

        for(Laptop l: Laptop.values()){
            System.out.println(l + " " + l.getPrice());
        }
    }
}

// Output:
// Macbook 2000
// Dell 1000
// Asus 1000
// hp 400
// Acer 410
