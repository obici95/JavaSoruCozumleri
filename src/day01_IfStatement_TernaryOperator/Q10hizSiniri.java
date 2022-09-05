package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10hizSiniri {
    public static void main(String[] args) {
         /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Aracinizin hizini giriniz");
        int hiz= scan.nextInt();
        System.out.println("Ehliyetiniz var mi? Varsa 'Y' yoksa 'N' tusuna basiniz");
        char ehliyet=scan.next().charAt(0);

        if (hiz>=55 && hiz<=74){
            if (ehliyet=='y'||ehliyet=='Y') {
                System.out.println("Cezaniz: 100 $'dır");
            }else {
                System.out.println("Ehliyetiniz olmadigi icin cezaniz 300 $'dir");
            }
        } else if (hiz>=75 && hiz<=84) {
            if (ehliyet=='y'||ehliyet=='Y'){
                System.out.println("Cezaniz: 150 $'dır");
            }else {
                System.out.println("Ehliyetiniz olmadigi icin cezaniz 350 $'dir");
            }
        } else if (hiz>=85 && hiz<=94) {
            if (ehliyet=='y'||ehliyet=='Y'){
                System.out.println("Cezaniz: 320 $'dır");
            }else {
                System.out.println("Ehliyetiniz olmadigi icin cezaniz 520 $'dir");
            }
        } else if (hiz>94) {
            if (ehliyet=='y'||ehliyet=='Y'){
                System.out.println("Cezaniz: 500 $'dır");
            }else {
                System.out.println("Ehliyetiniz olmadigi icin cezaniz 700 $'dir");
            }
        }
    }
}
