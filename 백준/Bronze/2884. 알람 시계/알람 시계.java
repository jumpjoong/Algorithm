import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int already = 45;
        int time = 24;
        //시간 받아와서 45분을 뺐는데 0보다 작으면 처리
        if(m - already < 0) {
            int n = m - already; //음수
            int aa = 60 + n; //음수 나온 값에서 60 - 음수
            h = h - 1;
            if(h < 0) {
                h = time - 1;
            }
            System.out.println(h+" "+aa);
        } else {
            int n = m - already;
            System.out.println(h+" "+n);
        }
    }
}