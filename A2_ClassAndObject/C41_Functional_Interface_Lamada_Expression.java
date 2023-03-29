/*
 * Tyoe of interface
 * 1. Normal
 * 2. Single abstract method - Functional Interface - Lamada Expression - Scala {Scala language... , Basic of Scala language} 
 * 3. Marker interface
*/

@FunctionalInterface // for one method inside interface Abc. [Actuly there is only one abstract method.]
interface Abc {
    void show();
    // void show2(); // Error: It shows an error, as the @FunctionalInterface class
    // has only one method.
}

public class C41_Functional_Interface_Lamada_Expression {

    public static void main(String arg[]) {
        // Abc oky = new Abc() {
        // public void show() {
        // System.out.println("I am the Best");
        // }
        // };

        /*
         * If interface has only one function means there is @FunctionalInterface, then
         * we can writ code like this also: Below:
         */
        // Abc oky = () ->
        // {
        // System.out.println("I am the Best");
        // };

        /* As above, there is only one line so we can write directly ... */

        /* >>>>>>>>>>> Lamada Expression >>>>>>>>>>> */

        Abc oky = () -> System.out.println("I am the Best");

        oky.show();
    }
}

// Output:
// I am the Best

/* >>>>>>>>>>> Lamada Expression >>>>>>>>>>> */
/*
 * Possible only when @FunctionalInterface.
 * (Only one method in the interface, not only in muiltiple methods.)
*/