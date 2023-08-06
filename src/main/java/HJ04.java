import java.util.Scanner;

public class HJ04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int j = input.length() % 8;
        int len =input.length()/8;

        StringBuffer stringBuffer = new StringBuffer();
       if (len ==0||(len>0&j>0))
            for (int i = 8 - j; i > 0; i--) {
                stringBuffer.append("0");
            }


        String string = stringBuffer.toString();
        String st = input + string;
        int index = 0;

        while (index < st.length()) {
            System.out.println(st.substring(index, index = index + 8));
        }
    }

}
