import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] n = br.readLine().split(" ");
        int basket = Integer.parseInt(n[0]);
        //원본배열
        int[] arr = new int[basket + 1];
        String input;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String[] number = input.split(" ");
            int start = Integer.parseInt(number[0]);
            int end = Integer.parseInt(number[1]);

            for (int i = start, j = end; i < j; i++, j--) {
                //14일 경우 i = 1 j = 4; 1 < 4;
                //temp = arr[1] = 1
                //arr[1] = arr[4]
                //arr[4] = arr[1]
                //그 다음 i = 2, j = 3
                //temp = arr[2]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String result = Arrays.stream(arr, 1, arr.length).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        bw.write(result);
        bw.close();
    }
}