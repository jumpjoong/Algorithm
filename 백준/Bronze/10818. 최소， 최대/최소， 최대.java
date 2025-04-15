import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String[] arr = br.readLine().split(" ");
        int max = Arrays.stream(arr).mapToInt(Integer::parseInt).max().getAsInt();
        int min = Arrays.stream(arr).mapToInt(Integer::parseInt).min().getAsInt();
        bw.write(String.valueOf(min + " " + max));
        bw.close();
    }
}