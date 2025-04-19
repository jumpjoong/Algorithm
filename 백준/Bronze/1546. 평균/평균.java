import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> arr = new ArrayList<>();
        br.readLine();
        String[] input = br.readLine().split(" ");

        for (String s : input) {
            arr.add(Integer.parseInt(s));
        }
        int max = arr.stream().mapToInt(Integer::intValue).max().getAsInt();
        double total = arr.stream().mapToInt(Integer::intValue).mapToDouble(s -> (double) s / max * 100).sum();

        double result = total / arr.size();
        bw.write(String.valueOf(result));
        bw.close();
    }
}