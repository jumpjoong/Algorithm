import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        //첫 번째 2차원 배열
        for (int i = 0; i < row; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                arr1[i][j] =  Integer.parseInt(arr[j]);
            }
        }
        //두 번째 2차원 배열
        for (int i = 0; i < row; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                arr2[i][j] =  Integer.parseInt(arr[j]);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int num = arr1[i][j] + arr2[i][j];
                bw.write(String.valueOf(num) + " ");
            }
            bw.newLine();
        }
        bw.close();
    }
}