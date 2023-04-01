import java.util.HashSet;
import java.util.Set;

public class C97_Set_Interface {
    public static void main(String arg[]) {
        Set<Integer> values = new HashSet<>();
        values.add(45);
        values.add(72);
        values.add(67);
        values.add(4);
        values.add(45); // repeat...

        for (Integer i : values) {
            System.out.println(i);
        }
    }
}

// Output:
// 67
// 4
// 72
// 45

// Sequence does not maintain in the set.


// visit next...