import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long num = 0L;
        for (int i = 1; i <= n; i++) {
            num += i;
        }
        System.out.println(num);
    }
}