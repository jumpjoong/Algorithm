import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        String first = new StringBuilder(arr[0]).reverse().toString();
        String last = new StringBuilder(arr[1]).reverse().toString();

        int firstN = Integer.parseInt(first);
        int lastN = Integer.parseInt(last);

        bw.write(String.valueOf(Math.max(firstN, lastN)));
        bw.close();
    }
}