import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while((input = br.readLine()) != null) {
            List<Integer> numArr = new ArrayList<>();
            int n = Integer.parseInt(input);
            int sum = 0;

            if (n == -1) {
                break;
            }

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    numArr.add(i);
                    sum += i;
                }
            }
            if (sum == n) {
                StringBuilder sb = new StringBuilder();
                sb.append(sum + " = ");
                for (int i = 0; i < numArr.size(); i++) {
                    sb.append(numArr.get(i));
                    if (i < numArr.size() - 1) {
                        sb.append(" + ");
                    }
                }
                bw.write(sb.toString());
                bw.newLine();
            } else {
                bw.write(n + " is NOT perfect.");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}