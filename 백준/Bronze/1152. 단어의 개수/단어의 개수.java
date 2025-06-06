import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().trim();
        if (input.isEmpty()) {
            bw.write("0");
        } else {
            String[] arr = input.split(" ");
            bw.write(String.valueOf(arr.length));
        }
        bw.close();
    }
}