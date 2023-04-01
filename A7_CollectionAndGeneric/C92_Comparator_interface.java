import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C92_Comparator_interface {
    public static void main(String arg[]){
        List<Integer> values = new ArrayList<>();
        values.add(453);
        values.add(551);
        values.add(344);
        values.add(248);
        values.add(360);

        // Comparator<Integer> c = (Integer i, Integer j)->{
        //         return (i%10>j%10)?1: -1;
        // }; // Workable

        // Comparator<Integer> c = (i, j)->{
        //         return (i%10>j%10)?1: -1;
        // }; // Workable

        Comparator<Integer> c = (i, j)-> (i%10>j%10)?1: -1; // Workable

        Collections.sort(values, c);

        for(Integer a : values){
            System.out.println(a);
        }
    }
}

// Output:
// 360
// 551
// 453
// 344
// 248

// Visite next