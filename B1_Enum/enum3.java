package B1_Enum;

enum Whatapp {
    Hello, Hi, Hay, hru, wrud, hmm, bye, tc, NiceToMeetYou;

}

public class enum3 {
    public static void main(String[] args) {
        Whatapp a = Whatapp.Hay;
        System.out.println(a);
        Whatapp b[] = Whatapp.values();
        System.out.println(b);// address
        System.out.println(b.hashCode());
        for (Whatapp aa : b) {
            System.out.println(aa + " " + aa.ordinal());
        }
        System.out.println(b[8]);
    }
}

// Output:
// Hay
// [LB1_Enum.Whatapp;@36baf30c
// 918221580
// Hello 0
// Hi 1
// Hay 2
// hru 3
// wrud 4
// hmm 5
// bye 6
// tc 7
// NiceToMeetYou 8
// NiceToMeetYou