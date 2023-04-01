// import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C99_Set_HashSetToTreeSet {
    public static void main(String arg[]) {

        Set<Integer> values = new TreeSet<>(); // useing TreeSet, we get sorted data.
        System.out.println(values.add(45));
        System.out.println(values.add(12));
        System.out.println(values.add(74));
        System.out.println(values.add(84));
        System.out.println(values.add(304));
        System.out.println(values.add(45)); // repeat...

        for (Integer i : values) {
            System.out.println(i);
        }
    }
}

// Output: // Sorted numbers:
// true
// true
// true
// true
// true
// false
// 12
// 45
// 74
// 84