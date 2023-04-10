
import java.util.Random;

public class RandomInJava{
    public static void main(String[] args) {
        Random r = new Random(10);

        for(int i = 0; i < 10; i++){
            System.out.println(r.nextFloat());
            System.out.println(r.nextBoolean());
            System.out.println(r.nextDouble());
            System.out.println(r.nextInt());
            System.out.println(r.nextInt(50));
            System.out.println(r.nextGaussian());
            System.out.println(r.getClass());
            System.out.println();
        }
        
    }
}

// Output:
// 0.73043025
// false
// 0.2578027905957804
// 254270492
// 6
// -0.561798736983973
// class java.util.Random

// 0.37061107
// true
// 0.8562829329414597
// -1224131505
// 30
// 0.6999553771175108
// class java.util.Random

// 0.28725684
// false
// 0.9162469512617625
// 35545786
// 9
// -0.059887332430133576
// class java.util.Random

// 0.9227111
// false
// 0.9621037571047796
// -855638999
// 2
// -0.4726899985043549
// class java.util.Random

// 0.43690282
// true
// 0.8147494366843138
// 924411021
// 10
// -0.8220948587559209
// class java.util.Random

// 0.47305065
// false
// 0.37742147097031054
// -1470233886
// 11
// -1.5772035963424782
// class java.util.Random

// 0.2568727
// true
// 0.7706538251068968
// -889477679
// 42
// 0.3432369626915107
// class java.util.Random

// 0.49645698
// true
// 0.4889514115421624
// 1074420380
// 45
// 0.379445201629819
// class java.util.Random

// 0.7535399
// true
// 0.21995442249183628
// 2085260337
// 37
// 1.1860504423058702
// class java.util.Random

// 0.008829951
// true
// 0.7343062903991874
// 301529617
// 2
// 0.8917686024235794
// class java.util.Random
