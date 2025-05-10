import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String[] num = input.split(" ");

            int firstNum = Integer.parseInt(num[0]);
            int secondNum = Integer.parseInt(num[1]);

            if(firstNum == 0 && secondNum == 0) {
                break;
            }
            if(secondNum % firstNum == 0) {
                bw.write("factor");
            } else if(firstNum % secondNum == 0) {
                bw.write("multiple");
            } else {
                bw.write("neither");
            }
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}