import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class C83_Iterator {
    public static void main(String arg[]) {
        Collection values = new ArrayList();

        values.add(5);
        values.add(7);
        values.add(4);

        Iterator it = values.iterator();

        System.out.println(it.next());  // 5
        System.out.println(it.next());  // 7
        System.out.println(it.next());  // 4
        // System.out.println(it.next());       // Error:Exception in thread "main" java.util.NoSuchElementException
                                                // at java.base/java.util.ArrayList$Itr.next(ArrayList.java:970)
                                                // at C83_Iterator.main(C83_Iterator.java:18)

    }
}