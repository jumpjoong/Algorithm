import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);  //6
        int k = Integer.parseInt(input[1]); //3

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        //사이즈가 4 k가 3
        if(list.size() >= k) {
            bw.write(String.valueOf(list.get(k - 1))); //k에서 -1 해야 인덱스 길이에 맞게 찾음
        } else {
            bw.write("0");
        }
        bw.flush();
        bw.close();
    }
}