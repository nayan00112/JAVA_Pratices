public class B10_Continue {
    public static void main(String arg[])
    {
        System.out.println("Print the series of even number using for loop up to number 20; like 0, 2, 4, 6,..., 20.");

        for(int i = 0; i<=20; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
            else
            {
                continue;
            }
        }
    }
}

//  Output: 
//  0 2 4 6 8 10 12 14 16 18 20