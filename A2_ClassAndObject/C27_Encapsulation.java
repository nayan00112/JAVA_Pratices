//  Encapsulation -> Binding Data With Methods
class Student {
    private String name;
    private int rollNum;

    public void setRollNum(int r){
        rollNum = r;
        System.out.println(r + " roll number is assigned successfuly.");
        // We can make such that softwere maintain log report on user assigning and access the data with the help of Encapsulation consept.
    }
    public int getRollNum(){
        return rollNum;
    }

    // For name
    public void setName(String name){
        this.name = name;
        System.out.println(name + " name is assigned successfuly.");
    }
    public String  getName(){
        return name;
    }
}

public class C27_Encapsulation {
    public static void main(String arg[]) {
        Student s1 = new Student();
        s1.setName("Magan");
        s1.setRollNum(5);

        System.out.println(s1.getName());
        System.out.println(s1.getRollNum());
        
    }
}

// Output:
// Magan name is assigned successfuly.
// 5 roll number is assigned successfuly.
// Magan
// 5
