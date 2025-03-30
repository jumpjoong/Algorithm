import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] board = new char[8][8];
        Map<Character, Integer> score = new HashMap<>();
        score.put('K', 0);
        score.put('P', 1);
        score.put('N', 3);
        score.put('B', 3);
        score.put('R', 5);
        score.put('Q', 9);

        int whiteScore = 0;
        int blackScore = 0;

        for (int i = 0; i < 8; i++) {
            //한 줄 단위로
            String line = br.readLine();
            board[i] = line.toCharArray();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char ch = board[i][j];
                if(Character.isUpperCase(ch)) {
                    whiteScore += score.getOrDefault(ch, 0);
                } else if (Character.isLowerCase(ch)) {
                    blackScore += score.getOrDefault(Character.toUpperCase(ch), 0);
                }
            }
        }
        System.out.println(whiteScore - blackScore);
    }
}