import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        for( int i = 0; i < input; i++) {
            for (int j = 1; j<input-i ; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < i*2+1 ; k++) {
                bw.write("*");
            }
            bw.newLine();
            bw.write("");
        }
        for (int a = 1; a<input; a++) {
            for (int b = input; b > input-a;  b--) {
                bw.write(" ");
            }
            for (int c = 0; c < (input * 2 - 1) - (a * 2) ; c++) {
                bw.write("*");
            }
            bw.newLine();
            bw.write("");
        }
        bw.close();
    }
}