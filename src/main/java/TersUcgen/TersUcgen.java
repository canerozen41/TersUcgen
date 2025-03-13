import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını al
        System.out.print("Basamak Sayısı: ");
        int basamak = scanner.nextInt();

        // Döngülerle ters üçgen oluşturma
        for (int i = basamak; i > 0; i--) {
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
