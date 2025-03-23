import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int male;
        int female;
        while (true) {
            male = sc.nextInt();
            female = sc.nextInt();

            if (male == 0 && female == 0) {
                break;
            }
            System.out.println(male + female);
        }
    }
}