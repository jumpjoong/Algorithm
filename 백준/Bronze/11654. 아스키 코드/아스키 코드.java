import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char ch = input.charAt(0);
        int n = (int) ch;
        bw.write(String.valueOf(n));
        bw.close();
    }
}