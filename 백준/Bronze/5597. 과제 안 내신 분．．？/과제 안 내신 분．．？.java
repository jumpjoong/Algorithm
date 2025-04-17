import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] submitted = new boolean[31];

        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int num = Integer.parseInt(input);
            submitted[num] = true;
        }

        for (int i = 1; i < submitted.length; i++) {
            if (!submitted[i]) {
                bw.write(String.valueOf(i) + " \n");
            }
        }
        bw.close();
    }
}