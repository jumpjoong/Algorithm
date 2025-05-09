import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < n; i++) {
            s.append("*");
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();
    }
}