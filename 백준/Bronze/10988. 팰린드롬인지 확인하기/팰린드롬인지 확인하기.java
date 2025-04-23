import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder(input);
        String reverse = String.valueOf(sb.reverse());

        if(input.equals(reverse)) {
            bw.write(String.valueOf(1));
        } else {
            bw.write(String.valueOf(0));
        }
        bw.close();
    }
}