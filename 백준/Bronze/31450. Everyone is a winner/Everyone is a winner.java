import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n1%n2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}