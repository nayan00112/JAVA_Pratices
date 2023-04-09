package B1_Enum;

enum MyStatus{
    Running, Failed, Pending, Success;

}
public class enum1 {
    public static void main(String[] args) {
        
        MyStatus m = MyStatus.Success;
        System.out.println(m);    

        System.out.println(m.ordinal());
        System.out.println(m.hashCode());
        System.out.println(m.getClass());
        System.out.println(m.toString());
        System.out.println(MyStatus.Success);
        System.out.println(MyStatus.Running.ordinal());

        System.out.println(m.getClass().getSuperclass());
    }
}

// Output:
// Success
// 3
// 918221580
// class B1_Enum.MyStatus
// Success
// Success
// 0
// class java.lang.Enum


// enum is class but it cannot be extended to anaother class.