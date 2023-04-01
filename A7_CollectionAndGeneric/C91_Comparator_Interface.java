import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C91_Comparator_Interface {
    public static void main(String arg[]){
        List<Integer> values = new ArrayList<>();
        values.add(453);
        values.add(551);
        values.add(344);
        values.add(248);
        values.add(360);

        Comparator<Integer> c = new Comparator<Integer>() {
            public int compare (Integer i, Integer j){
                // this is also workable
                // if(i%10> j%10)
                //     return 1;
                // else
                //     return -1;

                return (i%10>j%10)?1: -1;
            }
        };

        Collections.sort(values, c);

        for(Integer a : values){
            System.out.println(a);
        }
    }
}

// Outpiut:
// 360
// 551
// 453
// 344
// 248

// visit next...