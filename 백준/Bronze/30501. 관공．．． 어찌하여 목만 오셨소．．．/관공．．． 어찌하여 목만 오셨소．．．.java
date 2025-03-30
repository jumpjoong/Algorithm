import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String findName = "S";
        String ttt = "";
        for(int i = 0; i < n; i++){
            String str = br.readLine();

            if(str.contains(findName)){
                ttt = str;
            }
        }
        System.out.println(ttt);
    }
}