class Smartphone {
    String Compny, model;
    int price, ram, internalStorage;

    public Smartphone() {
        ram = 6;
        internalStorage = 128;
        Compny = "Samsung";
        model = "A30";
        price = 15000;
    }
    // Constracture overloding
    public Smartphone(int r, int i, String cname, String p_model, int price) {
        ram = r;
        internalStorage = i;
        Compny = cname;
        model = p_model;
        this.price = price; // hear price is local instance and also local variable, both have same name,
                            // thus this keyword is use to instance variable. left is local variable and
                            // right is loca instance
    }

    public void info() {
        System.out.println("Compnay is " + Compny + ".");
        System.out.println("Model is " + model + ".");
        System.out.println("Rame size in GB is " + ram + ".");
        System.out.println("Internal Storage in GB is " + internalStorage + ".");
        System.out.println("Compnay is " + Compny + ".");
        System.out.println("Price is " + price + ".");
    }

}

public class C05_Constructor_Overloding {
    public static void main(String arg[]) {
        Smartphone s1 = new Smartphone();
        s1.info();
        System.out.println();
        Smartphone s2 = new Smartphone(8, 256, "Nokia", "NK_3510", 20000);
        s2.info();
    }
}

// Output:
// Compnay is Samsung.
// Model is A30.
// Rame size in GB is 6.
// Internal Storage in GB is 128.
// Compnay is Samsung.
// Price is 15000.

// Compnay is Nokia.
// Model is NK_3510.
// Rame size in GB is 8.
// Internal Storage in GB is 256.
// Compnay is Nokia.
// Price is 20000.
