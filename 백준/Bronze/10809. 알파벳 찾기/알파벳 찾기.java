import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] arr = new int[26];

        // 처음엔 전부 -1로 초기화
        Arrays.fill(arr, -1);

        for (int i = 0; i < input.length(); i++) {
            //아스키 코드로 변환
            char ch = input.charAt(i);
            //ch가 a = 46일 경우 idx는 0
            int idx = ch - 'a';
            //a 알경우 0
            if(arr[idx] == -1) {
                arr[idx] = i;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }
        bw.close();
    }
}