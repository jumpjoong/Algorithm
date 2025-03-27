import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String msg = "";

        switch (text) {
            case "SONGDO" :
                msg = "HIGHSCHOOL";
                break;
            case "CODE" :
                msg = "MASTER";
                break;
            case "2023" :
                msg = "0611";
                break;
            case "ALGORITHM" :
                msg = "CONTEST";
                break;
            default:
                msg = "";
                break;
        }
        System.out.println(msg);
    }
}