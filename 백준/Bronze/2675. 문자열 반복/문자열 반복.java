import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String[] arr = input.split(" ");
            String first = arr[0];
            String[] last = arr[1].split("");
            for (int i = 0; i < last.length; i++) {
                bw.write(last[i].repeat(Integer.parseInt(first)));
            }
            bw.newLine();
        }
        bw.close();
    }
}