import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> count = new HashSet<>();
        final int standard = 42;
        String input;
        int n;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            n = Integer.parseInt(input);
            count.add( n % standard);
        }

        bw.write(String.valueOf(count.size()));
        bw.close();
    }
}