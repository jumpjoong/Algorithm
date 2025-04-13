import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalMoney = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int money = 0;

        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int c = Integer.parseInt(input[1]);
            money += n * c;
        }
        if (totalMoney == money) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}