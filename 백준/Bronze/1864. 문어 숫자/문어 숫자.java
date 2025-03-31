import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> octopus = new HashMap<>();
        List<char[]> inputList = new ArrayList<>();
        int octopusScore = 0;
        int octopusLeg = 8;
        octopus.put('-', 0);
        octopus.put('\\', 1);
        octopus.put('(', 2);
        octopus.put('@', 3);
        octopus.put('?', 4);
        octopus.put('>', 5);
        octopus.put('&', 6);
        octopus.put('%', 7);
        octopus.put('/', -1);
        while (true) {
            String line = br.readLine();

            if(line.equals("#")) break;
            inputList.add(line.toCharArray());
        }
        char[][] octoNumbers = new char[inputList.size()][];
        for (int i = 0; i < inputList.size(); i++) {
            octoNumbers[i] = inputList.get(i);
        }
        for(int i = 0; i < octoNumbers.length; i++) {
            octopusScore = 0;
            for (int j = 0; j < octoNumbers[i].length; j ++) {
                char ch = octoNumbers[i][j];
                //일치하는 값 가져옴
                int value = octopus.get(ch);
                //매스 포우로 값 넣을 값
                int power = octoNumbers[i].length - j -1;
                octopusScore += (int) (value * Math.pow(octopusLeg, power));
            }
            System.out.println(octopusScore);
        }
    }
}