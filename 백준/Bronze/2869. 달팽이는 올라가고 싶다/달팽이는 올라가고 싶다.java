import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int day = Integer.parseInt(input[0]);
        int sleep = Integer.parseInt(input[1]);
        int legnth = Integer.parseInt(input[2]);

        //2 - 1 = oneCycle
        int oneCycle = day - sleep;
        //5 - 1 = rule
        int rule = legnth - sleep;
        int count = rule / oneCycle;
        //이게 왜 됨?
        if(rule % oneCycle != 0) {
            count++;
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}