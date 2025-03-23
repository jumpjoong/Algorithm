import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        for(int i = 1; i <= range; i ++) {
            System.out.println(i);
        }
    }
}