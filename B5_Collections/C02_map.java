import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

class C02_map {
    public static void main(String[] args) {
        System.out.println("======== HashMap ========");
        Map<String, String> m = new HashMap<>();
        m.put("name", "Nayan");
        m.put("id", "107048");
        m.put("email", "nayan123@g.c");
        m.put("Age", "21");

        for (String s : m.keySet()) {
            System.out.println(s + " = " + m.get(s));
        }

        System.out.println(m);
        System.out.println("======== HashTable ========");

        Map<String, String> ht = new Hashtable<>();
        ht.put("Name", "Nayankumar");
        ht.put("Address", "Gujarat, India");
        ht.put("House no.", "92");

        for (String t : ht.keySet()) {
            System.out.println(t + " = " + ht.get(t));
        }
        System.out.println(ht);

        System.out.println("======== TreeMap ========");

        Map<String, String> tm = new TreeMap<>();
        tm.put("Treename", "Banana");
        tm.put("Age of tree", "345");
        tm.put("ok", "okk");

        for (String y : tm.keySet()) {
            System.out.println(y + " = " + tm.get(y));
        }
        System.out.println(tm);
    }
}

// Output:
// ======== HashMap ========
// name = Nayan
// id = 107048
// email = nayan123@g.c
// Age = 21
// {name=Nayan, id=107048, email=nayan123@g.c, Age=21}
// ======== HashTable ========
// Name = Nayankumar
// House no. = 92
// Address = Gujarat, India
// {Name=Nayankumar, House no.=92, Address=Gujarat, India}
// ======== TreeMap ========
// Age of tree = 345
// Treename = Banana
// ok = okk
// {Age of tree=345, Treename=Banana, ok=okk}