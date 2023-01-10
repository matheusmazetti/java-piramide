import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int n;
        System.out.println("Digite o tamanho da piramide: ");
        n = read.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
