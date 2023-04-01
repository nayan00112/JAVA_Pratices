import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C90_CollectionsClass {
    public static void main(String arg[]){
        List<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(55);
        values.add(34);
        values.add(24);
        values.add(3);

        Collections.sort(values); // Collections; not Collection

        for(Integer a : values){
            System.out.println(a);
        }

        System.out.println();
        Collections.reverse(values);
        for(Integer a : values){
            System.out.println(a);
        }

        System.out.println();
        Collections.shuffle(values);
        for(Integer a : values){
            System.out.println(a);
        }
    }
}

// Output:
// 3
// 4
// 24
// 34
// 55
// 
// 55
// 34
// 24
// 4
// 3
// 
// 34
// 3
// 55
// 24
// 4
