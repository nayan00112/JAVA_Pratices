class Student {
    private String name;
    private int rollNum;

    // VARIABLE MUST BE PRIVATE SO ANYONE CANNOT ACCESS DIRECTLY OR ASSIGN DIRECTLY LIKE: {objectname.variablename = "value"} 
    // Encapsulation make more secure our programm.


    // VARIABLE MUST BE PRIVATE AND GETTERS AND SETTERS MUST BE PUBLIC.
    
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

public class C26_Encapsulation {
    public static void main(String arg[]) {
        Student s1 = new Student();
        s1.setName("Magan");
        s1.setRollNum(5);

        System.out.println(s1.getName());
        System.out.println(s1.getRollNum());
        
    }
}

// Output:
// Magan
// 5

// --------------------------------------------------
//  Encapsulation -> Binding Data With Methods
// --------------------------------------------------
