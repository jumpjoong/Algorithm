import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int oneThousand = 1000;
        final int oneMillion = 10000;
        final int oneHundred = 100;
        int[] nArr = new int[3];
        int maxCount = 0;
        int highScore = 0;

        String[] input = br.readLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            nArr[i] = Integer.parseInt(input[i]);
        }
        if (nArr[0] == nArr[1] && nArr[1] == nArr[2]) {
            System.out.println(oneMillion + nArr[0] * oneThousand);
            return;
        }
        if (nArr[0] == nArr[1] || nArr[1] == nArr[2] || nArr[2] == nArr[0]) {
            Map<Integer, Integer> count = new HashMap<>();
            for (int num : nArr) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                if (maxCount < entry.getValue()) {
                    highScore = entry.getKey();
                    maxCount = entry.getValue();
                }
            }
            System.out.println(oneThousand + highScore * oneHundred);
        } else {
            int max = Arrays.stream(nArr).max().getAsInt();
            System.out.println(oneHundred * max);
        }
    }
}