import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int num = Integer.parseInt(br.readLine());
        String input;
        for (int j = 0; j < num; j ++) {
            input = br.readLine();
            boolean[] checkArr = new boolean[26];
            boolean a = true;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if(!checkArr[ch - 'a']) {
                    //이미 등록된 문자가 아니라면 등록하기
                    checkArr[ch - 'a'] = true;
                } else {
                    //처음 등록하는 문자가 아니라면 연속된 단어이어야함
                    if(input.charAt(i - 1) != ch) {
                        //현재의 단어에서 이전 문자와 다르다면 포문 종료 카운트 안 셈 밑의 코드에서
                        a = false;
                        break;
                    }
                }
            }
            //한 문장에 대해서 끝나고 연속된 단어인지 아닌지 판별 여부
            if(a) {
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}