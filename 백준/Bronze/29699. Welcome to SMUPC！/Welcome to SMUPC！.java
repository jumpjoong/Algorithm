import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = "WelcomeToSMUPC"; // 14글자
        int n = Integer.parseInt(br.readLine());

        int findLength = (n-1) %text.length();

        System.out.println(text.charAt(findLength ));
    }
}