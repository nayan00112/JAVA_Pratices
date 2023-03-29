class Student {
    String name;
    int rollNum;
}

public class C24_Encapsulation {
    public static void main(String arg[]) {
        Student s1 = new Student();
        s1.name = "Magan";
        s1.rollNum = 5;

        System.out.println(s1.name);
        System.out.println(s1.rollNum);

        /*
         * For assigning value of variable directly like this, is not good thing.
         * We use methods for assigning and getting the value of the variable. It is
         * called Encapsulation.
         */

         // VISIT NEXT.. 
        //  Encapsulation -> Binding Data With Methods

    }
}
