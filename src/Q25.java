import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(s.nextLine().contains("SILVA") ? "contem" : " nao contem ");
        s.close();
    }
}
