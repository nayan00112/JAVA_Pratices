package A8_Miscellaneous;


class MargeArray{
     public static int[] marge_Array(int[] a, int[] b){
        int[] kk = new int[a.length + b.length];
        int index = 0;
        for(int i = 0; i < a.length; i++){
            kk[index] = a[i];
            index++;
        }
        for(int i = 0; i < b.length; i++){
            kk[index] = b[i];
            index++;
        }
        return kk;
    }
}
public class ArrayInbuiltMethods {
    public static void main(String[] args){
        int a[] = { 4, 6, 7, 9, 10};
        int b[] = {34, 46, 37, 92, 5, 6};

        int c[];

        System.out.println(a[0]);
        System.out.println(b[0]);
        c = MargeArray.marge_Array(a, b);

        for(int p = 0; p < c.length; p++){
            System.out.print(c[p]+" ");
        }
    }

}
