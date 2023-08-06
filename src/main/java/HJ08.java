import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class HJ08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Long> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            Integer key = Integer.valueOf(scanner.next());
            long value = scanner.nextLong();
            map.put(key, map.getOrDefault(key, 0L)+value);
        }
        map.forEach((s, aLong) -> System.out.println(s + " "+ aLong));



    }
}

