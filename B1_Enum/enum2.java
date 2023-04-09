package B1_Enum;


enum oky{
    He, She, It, They, We, I, You;
}
public class enum2 {
    public static void main(String[] args) {
        oky h = oky.I;
        System.out.println(h);

        oky b = oky.We;
        System.out.println(b);
        System.out.println(b.ordinal());
    }
}

// output:
// I
// We
// 4