
//  Encapsulation -> Binding Data With Methods

class Student {
    String name;
    int rollNum;

    // for RollNumber
    public void setRollNum(int r){
        rollNum = r;
    }
    public int getRollNum(){
        return rollNum;
    }

    // For name
    public void setName(String name){
        this.name = name;
    }
    public String  getName(){
        return name;
    }

}

public class C25_Encapsulation {
    public static void main(String arg[]) {
        Student s1 = new Student();
        s1.setName("Magan");
        s1.setRollNum(5);

        System.out.println(s1.getName());
        System.out.println(s1.getRollNum());

        /*
         * We use methods for assigning and getting the value of the variable. It is
         * called Encapsulation.
         * 
         * Like this, We make functions for fetching and setting variable values. Hear getters (for get value) and setters (for set value).
         */

         // VISIT NEXT: Anyone cannot access directly to the variable. it is possible also with function calls.  WHY??? VISITE NEXT... :)
    }
}

// Output:
// Magan
// 5



/*
 * Same output but this is batter method for assigning and fatching variable data, because in function
 * we make a function as a it also maintain log file for any update. or mesaage like "Assigning done. etc..."
 * 
 * 
 * Anyone cannot access directly to the variable. it is possible also with function calls.  WHY??? VISITE NEXT... [:)] (ans: Private variables, example is in next code...)
*/