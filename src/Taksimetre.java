import java.util.Scanner;

/**
 * ClassName: Taksimetre
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 4/30/2023 7:33 AM
 * @Version 1.0
 */
public class Taksimetre {
    public static void main(String[] args) {
        double minpric,openpric,kmpric,km,total;
        kmpric = 2.20;
        minpric = 20;
        openpric = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("KM giriniz : ");
        km = input.nextDouble();
        total = (km * kmpric) + openpric;
        if (total<20){
            total = minpric;
        }
        System.out.println("Odenecek Turar: " + total);

    }
}
