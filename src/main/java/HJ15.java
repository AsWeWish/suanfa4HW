import java.math.BigInteger;
import java.util.Scanner;

public class HJ15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String bin = Integer.toString(n, 2);
        int m = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i)==49) m++;
        }
        System.out.println(m);
    }
}
