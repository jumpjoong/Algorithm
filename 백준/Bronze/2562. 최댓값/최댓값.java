import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> arr = new ArrayList<>();
        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            arr.add(Integer.parseInt(input));
        }
        int max = Collections.max(arr);
        int n = arr.indexOf(max);
        bw.write(max + " " + (n + 1));
        bw.close();
    }
}