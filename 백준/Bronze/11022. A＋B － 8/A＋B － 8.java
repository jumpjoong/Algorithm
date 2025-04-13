import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int number = 0;
            String[] input = br.readLine().split(" ");
            number += Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
            bw.write(String.valueOf("Case #" + (i+1) + ": " + input[0] + " + " + input[1] + " = " + number + "\n"));
        }
        bw.close();
    }
}