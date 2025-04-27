import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Double> score = new HashMap<>();
        score.put("A+", 4.5);
        score.put("A0", 4.0);
        score.put("B+", 3.5);
        score.put("B0", 3.0);
        score.put("C+", 2.5);
        score.put("C0", 2.0);
        score.put("D+", 1.5);
        score.put("D0", 1.0);
        score.put("F", 0.0);

        String input;
        //과목 갯수
        int count = 0;
        //과목 평점 + 학점
        double num = 0.0;
        //학점
        double bb = 0.0;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String[] inputArr = input.split(" ");
            if(score.containsKey(inputArr[2])) {
                //과목평점
                Double aa = score.get(inputArr[2]);
                //학점
                bb += Double.parseDouble(inputArr[1]);
                //과목 평점 * 학잠
                num += aa * Double.parseDouble(inputArr[1]);
                count++;
            } else {
                continue;
            }
        }
        double avg = num / bb;
        bw.write(String.valueOf(avg));
        bw.close();
    }
}