import java.util.Scanner;


import java.util.Scanner;

public class HJ6 {


    // 注意类名必须为 Main, 不要有任何 package xxx 信息

    public static void main(String[] args) {
        // 处理输入
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // 获取需要求解的值
            int target = sc.nextInt();
            int y = 2;// 因子从2开始算
            while (target != 1) { // 短除法，除到目标值为1为止
                if (target % y == 0) { // 能能够整除2
                    System.out.print(y + " ");
                    target /= y;
                } else { // 更新y的值
                    if (y > target / y) {
                        y = target;
                    } else y++;
                }
            }
        }
    }


}


