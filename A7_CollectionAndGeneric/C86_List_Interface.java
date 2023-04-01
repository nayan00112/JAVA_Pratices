import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class C86_List_Interface {
    public static void main(String arg[]){
        List values = new ArrayList();
        values.add(1);
        values.add(2);
        values.add(4);
        values.add(5);
        values.add(2, 3); // (index, element)

  
        Iterator it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

// Output
// 1
// 2
// 3
// 4
// 5