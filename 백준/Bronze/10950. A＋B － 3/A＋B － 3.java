import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nArr = new int[n];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int number = 0;
            for (int j = 0; j < str.length; j++) {
                number += Integer.parseInt(str[j]);
            }
            System.out.println(number);
        }
    }
}