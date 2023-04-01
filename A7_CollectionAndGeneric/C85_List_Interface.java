import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class C85_List_Interface {
    public static void main(String arg[]){
        List values = new ArrayList();
        values.add(9);
        values.add(2);
        values.add(4);
        values.add(5);
        values.add(5); // repeat...

        Iterator it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

// Output:
// 9
// 2
// 4
// 5
// 5