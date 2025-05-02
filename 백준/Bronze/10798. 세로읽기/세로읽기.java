import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Character[][] arr = new Character[5][15];
        int maxRange = 0;
        //arr에 값 넣기
        for (int i = 0; i < arr.length; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if(maxRange < input.length()) {
                    maxRange = input.length();
                }
                char ch = input.charAt(j);
                arr[i][j] = ch;
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i] != null) {
                    bw.write(String.valueOf(arr[j][i]));
                } else {
                    continue;
                }
            }
        }
        bw.close();
    }
}