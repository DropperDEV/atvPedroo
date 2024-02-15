import java.util.Arrays;

public class Q73 {
    public static void main(String[] args) {
        String[] t = {"Flamengo", "Atlético Mineiro", "Palmeiras", "Fortaleza", "Bragantino", "Athletico Paranaense", "Atlético Goianiense", "Ceará", "Internacional", "Fluminense", "Corinthians", "Juventude", "São Paulo", "Sport Recife", "Cuiabá", "América Mineiro", "Santos", "Grêmio", "Bahia", "Chapecoense"};
        for(int i=0;i<5;i++) System.out.println((i+1)+". "+t[i]);
        for(int i=t.length-4;i<t.length;i++) System.out.println((i+1)+". "+t[i]);
        Arrays.sort(t);
        for(int i=0;i<t.length;i++) System.out.println((i+1)+". "+t[i]);
        System.out.println("\nO Chapecoense está na posição: "+(Arrays.binarySearch(t,"Chapecoense")+1));
    }
}
