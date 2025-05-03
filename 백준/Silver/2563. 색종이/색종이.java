import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[][] arr = new boolean[100][100];
        int paperWidth = 10;
        int paperHeight = 10;

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] num = br.readLine().split(" ");
            int width = Integer.parseInt(num[0]);
            int height = Integer.parseInt(num[1]);
            for (int j = width; j < width + paperWidth; j++) {
                for (int k = height; k < height + paperHeight; k++) {
                    if(arr[j][k] == false) {
                        arr[j][k] = true;
                    } else {
                        continue;
                    }
                }
            }
        }
        for (boolean[] row : arr) {
            for (boolean  t : row) {
                if (t) count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}