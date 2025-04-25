import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(ch == 'c' && i + 1 < input.length()) {
                if(input.charAt(i + 1) == '=' || input.charAt(i + 1) =='-') {
                    i++;
                }
            } else if (ch == 'd' && i + 1 < input.length()) {
                if(input.charAt(i + 1) == 'z' && i + 2 < input.length()) {
                    if(input.charAt(i + 2) == '=') {
                        i += 2;
                    }
                } else if (input.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (ch == 'l' && i + 1 < input.length()) {
                if(input.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if (ch == 'n' && i + 1 < input.length()) {
                if(input.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if(ch == 's' && i + 1 < input.length()) {
                if(input.charAt(i + 1) == '=') {
                    i++;
                }
            } else if (ch == 'z' && i + 1 < input.length()) {
                if(input.charAt(i + 1) == '=') {
                    i++;
                }
            }
            count++;
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}