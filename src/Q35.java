import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble();
        boolean f = (a < b + c) && (b < a + c) && (c < a + b);
        System.out.println(f ? "As retas podem formar um triângulo." : "As retas NÃO podem formar um triângulo.");
        s.close();
    }
}
