import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {1, 1, 2, 2, 2, 8};
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            int n = Integer.parseInt(input[i]);
            int number = arr[i] - n;
            arr[i] = number;
        }
        String join = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        bw.write(join);
        bw.close();
    }
}