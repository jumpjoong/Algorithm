import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // 개수
        int x = Integer.parseInt(input[1]); // 기준값
        String[] arr = br.readLine().split(" ");
        List<Integer> result = Arrays.stream(arr)
            .map(Integer::parseInt)
            .filter(num -> num < x)
            .collect(Collectors.toList());
        String join = result.stream().map(String::valueOf).collect(Collectors.joining(" "));
        bw.write(join);
        bw.close();
    }
}