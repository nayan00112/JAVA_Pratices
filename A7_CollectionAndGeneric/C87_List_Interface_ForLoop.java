import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class C87_List_Interface_ForLoop {
    public static void main(String arg[]){
        List values = new ArrayList();
        values.add(1);
        values.add(2);
        values.add(4);
        values.add(5);
        values.add(2, 3); // (index, element)
        values.add(6);

  
        Iterator it = values.iterator();
        for(int i = 0; i < values.size(); i++){
            System.out.println(values.get(i));
        }
    }
}

// Output
// 1
// 2
// 3
// 4
// 5
// 6