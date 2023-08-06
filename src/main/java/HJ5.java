import java.math.BigInteger;
import java.util.Scanner;

public class HJ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String shiliu = in.nextLine();
        shiliu= shiliu.toLowerCase();
        if (shiliu.contains("0x")){
            shiliu=shiliu.substring(2,shiliu.length());
        }
        if (shiliu.length() > 0){
            BigInteger bigInteger = new BigInteger(shiliu, 16);
            System.out.println(bigInteger);
        }
    }
}
