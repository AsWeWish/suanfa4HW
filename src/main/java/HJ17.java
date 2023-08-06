import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class HJ17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zuobiaos = scanner.next();
        String[] zuobiao = zuobiaos.split(";");
        int heng = 0;
        int shu = 0;
        int len ;
        for (int i = 0; i < zuobiao.length; i++) {
            String s = zuobiao[i];
            if (s.length() > 1) {
                String substring = s.substring(0, 1);
                String length = s.substring(1);

                    try {
                        len = Integer.parseInt(length, 10);
                    } catch (NumberFormatException e) {
                        continue;
                    }
                    if (substring.equals("S")) {
                        shu = shu - len;
                    } else if (substring.equals("W")) {
                        shu = shu + len;
                    } else if (substring.equals("A")) {
                        heng = heng - len;
                    } else if (substring.equals("D")) {
                        heng = heng +len;
                    }
                }
        }
        System.out.println(heng + "," + shu);

    }
}
