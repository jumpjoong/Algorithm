import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, Integer> arr = new HashMap<>();
        String input = br.readLine().toUpperCase();
        List<Character> maxArr = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char cr = input.charAt(i);
            arr.put(cr, arr.getOrDefault(cr, 0) + 1);
        }
        int max = Collections.max(arr.values());
        for (Map.Entry<Character, Integer> ele : arr.entrySet()) {
            if(ele.getValue() == max) {
                maxArr.add(ele.getKey());
            }
        }
        if(maxArr.size() != 1) {
            bw.write(String.valueOf("?"));
        } else {
            String wr = maxArr.get(0).toString().toUpperCase();
            bw.write(wr);
        }
        bw.close();
    }
}