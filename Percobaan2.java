import java.util.Scanner;
public class Percobaan2 {
    static StringBuilder deret = new StringBuilder();

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            deret.append("1");
            return 1;
        } else {
            deret.append(x).append("x");
            return x * hitungPangkat(x, y - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);

        if (deret.charAt(deret.length() - 1) == 'x') {
            deret.deleteCharAt(deret.length() - 1);
        }
        System.out.println(deret + " = " + hasil);
    }
}
