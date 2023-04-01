import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class C84_Iterator_hasNextMethod {
    public static void main(String arg[]) {
        Collection values = new ArrayList();

        values.add(5);
        values.add(7);
        values.add(4);
        values.add(8);

        Iterator it = values.iterator();

        while (it.hasNext()){
            System.out.println(">>> " + it.next());
        }
    }
}

// Output:
// >>> 5
// >>> 7
// >>> 4
// >>> 8