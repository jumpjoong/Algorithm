import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        //바구니의 총 갯수 = arr.length
        int n = Integer.parseInt(input[0]);
        String text;
        //바구니 순서
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        while ((text = br.readLine()) != null && !text.isEmpty()) {
            //첫 번째 바구니, 두 번째 바구니 받기
            String[] inputNum = text.split(" ");
            //첫 번쨰 바구니
            int start = Integer.parseInt(inputNum[0]);
            int firstBasket = arr[start - 1];
            //두 번째 바구니
            int end = Integer.parseInt(inputNum[1]);
            int secondBasket = arr[end - 1];

            arr[start - 1] = secondBasket;
            arr[end - 1] = firstBasket;
        }
        String join = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        bw.write(join);
        bw.close();
    }
}