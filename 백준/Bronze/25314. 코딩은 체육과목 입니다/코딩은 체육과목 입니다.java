import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int four = 4;
        int n = input / four;
        String text = "long ";
        System.out.println(text.repeat(n) + "int");
    }
}