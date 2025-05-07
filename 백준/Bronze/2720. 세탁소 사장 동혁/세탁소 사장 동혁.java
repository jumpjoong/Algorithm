import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int quarter = 25;
        int dime = 10;
        int nickel = 5;


        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int price = Integer.parseInt(br.readLine());

            int q = price / quarter;
            price %= quarter;

            int d = price / dime;
            price %= dime;

            int n = price / nickel;
            price %= nickel;

            int p = price;

            bw.write(String.valueOf(q + " " + d + " " + n + " " + p));
            bw.newLine();
        }
        bw.close();
    }
}