import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[9][9];
        int max = 0;
        int first = 0;
        int second = 0;

        for (int i = 0; i < arr.length; i++) {
            String[] a = br.readLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(a[j]);
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    first = i;
                    second = j;
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write((first + 1) + " " + (second + 1));
        bw.close();
    }
}