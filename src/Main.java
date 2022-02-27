import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yulduzchalar sonini kiriting: ");
        int n = scanner.nextInt();

        String star="";
        for (int j = 1; j <= n; j++){
            for (int i=j;i<=n; i++) {
                star +="*"+" ";
            }
            System.out.println(star);
            star="";
        }
    }
}
