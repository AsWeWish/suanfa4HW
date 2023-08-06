import java.util.Scanner;

public class HJ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int length = line.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = length-1; i >= 0; i--) {
            stringBuilder.append(line.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }
}
