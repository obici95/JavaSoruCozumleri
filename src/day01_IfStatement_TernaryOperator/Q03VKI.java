package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03VKI {
    public static void main(String[] args) {

        	/* TASK :
		 *  Kullanicinin boyunu  cm  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scan.nextInt();


        double BMI=kilo/((boy/100)*(boy/100));
        System.out.println("Vucut kilet indexiniz :"+BMI);

        if (BMI<=20){
            System.out.println("oldukca zayifsiniz");
        } else if (BMI>20 && BMI<=25) {
            System.out.println("Normal sinirlardasiniz");
        } else if (BMI>25 && BMI<=30) {
            System.out.println("Sisman kategorisindesiniz");
        }else if(BMI>30) {
            System.out.println("Obez grubundasiniz");
        }


    }
}
