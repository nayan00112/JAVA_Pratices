class Animal {
    public void setInfo(String n, String c, int ln) {
        System.out.println("Name of animal is " + n + ". That animal has " + ln + " number of legs. The color of " + n
                + " is " + c + ".");
    }
}

public class C03_classObj {
    public static void main(String arg[]) {
        Animal dog_obj = new Animal();
        dog_obj.setInfo("Dog", "white", 4);

        System.out.println();

        Animal cat_obj = new Animal();
        cat_obj.setInfo("Cat", "Black", 4);
    }
}

// Output
// Name of animal is Dog. That animal has 4 number of legs. The color of Dog is white.

// Name of animal is Cat. That animal has 4 number of legs. The color of Cat is Black.
