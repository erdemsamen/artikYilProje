import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Yılı Giriniz: ");
        int yıl = scanner.nextInt();

        if ((yıl % 4 == 0 && yıl % 100 != 0 ) || (yıl % 400 == 0 )) {
            System.out.println("Bir artık yıldır"); }
        else {
            System.out.println("Bir artık yıl değildir"); }
        scanner.close();
    }
}