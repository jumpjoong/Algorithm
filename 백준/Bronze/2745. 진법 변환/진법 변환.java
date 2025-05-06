import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String n = input[0];
        int num = Integer.parseInt(input[1]);
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            //진법 계산할 때 사용하는 메서드
            //
            int value = Character.getNumericValue(ch);
            result = result * num + value;
        }
        bw.write(String.valueOf(result));
        bw.close();
    }
}