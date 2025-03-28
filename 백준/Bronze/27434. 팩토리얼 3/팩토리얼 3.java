import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n == 0) {
            System.out.println(1);
            return;
        }
        System.out.println(factorial(1, n));
    }
    private static BigInteger factorial(int start, int end) {
        if(start == end) return BigInteger.valueOf(end);
        //입력 값 10 예시
        
        return factorial(start, (start + end) / 2).multiply(factorial((start + end) / 2 + 1, end));
    }
}