import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class C88_List_Interface_AddStringandInt {
    public static void main(String arg[]){
        List values = new ArrayList();
        values.add(31);
        values.add(42);
        values.add(72);
        values.add(45);
        values.add("25"); //String


        // Way 1:
        // Iterator it = values.iterator();
        // for(int i = 0; i < values.size(); i++){
        //     System.out.println(values.get(i));
        // }

        // Way 2:
        for (Object o : values){
            System.out.println(o);
        }
    }
}

// Output:
// 31
// 42
// 72
// 45
// 25

// Visite next...