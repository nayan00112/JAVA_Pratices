import java.util.HashSet;
import java.util.Set;

public class C98_Set_Interface {
    public static void main(String arg[]) {
        Set<Integer> values = new HashSet<>();
        System.out.println(values.add(45));
        System.out.println(values.add(42));
        System.out.println(values.add(44));
        System.out.println(values.add(45)); // repeat...

        for (Integer i : values) {
            System.out.println(i);
        }
    }
}

// Output:
// true
// true
// true
// false
// 42
// 44
// 45

// add() method return type is boolean, it return false for repeted value
// otherwise it is return true.