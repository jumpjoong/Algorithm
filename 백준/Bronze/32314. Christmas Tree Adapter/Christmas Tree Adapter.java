import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int treeAmpere = sc.nextInt();
        int adaptorWatt = sc.nextInt();
        int adaptorVolt = sc.nextInt();

        if (treeAmpere <= adaptorWatt/adaptorVolt) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}