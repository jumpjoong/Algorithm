import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int option = Integer.parseInt(br.readLine());
        int n = option + m;
        int hh = 0;
        int sixty = 60;
        if(n >= 60) { // 시간이 바뀔 경우
            if(n % 60 == 0) { // 정각으로 떨어질 때 계산
                int a = n / sixty; //h에다가 더할 값 만약 600 이면
                hh = h + a;
                m = 0;
                if (hh >= 24) {
                    hh = hh - 24;
                }
            } else { // 정각으로 안 떨어지는 경우
                int a = n / sixty;
                hh = h + a;
                m = m + option - sixty; // 옵션이 1000분이면?
                if (m >= 60) {
                    m = m % 60;
                }
                if (hh >= 24) {
                    hh = hh - 24;
                }
            }
            System.out.println(hh + " " + m);
        } else {
            System.out.println(h + " " + n);
        }
    }
}