// package B5_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.crypto.AEADBadTagException;

class C01_Collection {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        System.out.println(c.isEmpty());
        c.add("d");
        System.out.println(c.isEmpty());
        System.out.println(c);
        c.add("fg");
        c.add(4);
        System.out.println(c);
        System.out.println(c.size());
        System.out.println(c.toString());
        System.out.println(c.getClass());
        System.out.println(c.hashCode());
        // System.out.println(c.removeAll(c));
        System.out.println(c);
        System.out.println(c.size());

        Collection a = new LinkedList();
        a.add("a");
        a.addAll(c);
        System.out.println(a);

        System.out.println(a.contains("a"));

        LinkedList<String> l = new LinkedList<>();

        l.add("a");
        l.add("e");
        l.add("i");
        l.add("o");
        l.add("u");
        System.out.println(l);
        System.out.println(l.toArray());

        System.out.println(l.toString());

        // int val=45;
        // l.add
        // System.out.println(l);

        l.addFirst("ff");

        System.out.println(l);
        // l.addLast("5");
        l.add("5");

        l.remove(2);
        System.out.println(l);

        System.out.println("-----------------------------------------------");

        TreeMap<Integer, String> t = new TreeMap<>();
        System.out.println(t.keySet());
        t.put(1, "nayan");
        t.put(2, "parth");
        t.put(3, "sarjan");
        t.put(4, "kanj");
        System.out.println(t.keySet());
        System.out.println(t.values());
        System.out.println(t);
        System.out.println(t.remove(4, "kanj"));
        System.out.println(t);
        System.out.println(t.containsKey(2));
        System.out.println(t.containsValue("sarjanbhai"));
        

        System.out.println("-----------------------------------------------");

        Map<Integer, String> m = new HashMap<>();
        m.put(3, "d");
        m.put(45, "df");
        m.put(45, "def");
        System.out.println(m);



    }
}