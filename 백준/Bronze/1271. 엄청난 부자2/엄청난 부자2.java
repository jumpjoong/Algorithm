import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger firstNum = sc.nextBigInteger();
        BigInteger secondNum = sc.nextBigInteger();
        System.out.println(firstNum.divide(secondNum));
        System.out.println(firstNum.remainder(secondNum));
    }
}