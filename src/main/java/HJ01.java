import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class HJ01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String nextLine = in.nextLine();
        String[] s = nextLine.split(" ");
        System.out.println(s[s.length - 1].length());


    }
}