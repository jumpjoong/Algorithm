import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> aaa = new ArrayList<>();
        int bbb = 0;
        while (aaa.size() < 5) {
            int num = sc.nextInt();
            aaa.add((int)Math.pow(num,2));
        }
        for (Integer integer : aaa) {
            bbb += integer;
        }
        System.out.println(bbb%10);
    }
}