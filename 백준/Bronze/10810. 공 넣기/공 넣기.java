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
        int n = Integer.parseInt(input[0]);
        String text;
        int[] arr = new int[n];

        while ((text = br.readLine()) != null && !text.isEmpty()) {
            String[] inputNum = text.split(" ");
            int start = Integer.parseInt(inputNum[0]);
            int end = Integer.parseInt(inputNum[1]);
            int ballNumber = Integer.parseInt(inputNum[2]);

            for (int i = start -1; i < end; i++) {
                arr[i] = ballNumber;
            }
        }
        String join = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        bw.write(join);
        bw.close();
    }
}