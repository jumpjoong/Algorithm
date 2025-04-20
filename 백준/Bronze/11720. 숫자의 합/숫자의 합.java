import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String[] arr = br.readLine().split("");
        int n = 0;
        for (int i = 0; i < Arrays.stream(arr).count(); i++) {
            n += Integer.parseInt(arr[i]);
        }
        bw.write(String.valueOf(n));
        bw.close();
    }
}