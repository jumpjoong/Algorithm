import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String first = String.valueOf(input.charAt(0));
            String last = String.valueOf(input.charAt(input.length() - 1 ));
            bw.write(String.valueOf(first + last));
            bw.newLine();
        }
        bw.close();
    }
}