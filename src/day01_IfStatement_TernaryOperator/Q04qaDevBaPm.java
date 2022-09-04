package day01_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04qaDevBaPm {
    public static void main(String[] args) {
        /*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen IT bilginizi giriniz.\n" +
                "qa\ndev\n" +
                "ba\npm ");

        String itBilgisi = scan.next();

        String qa = "Qualty Analyst";
        String dev = "Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";

        if (itBilgisi.equals("qa")) {
            System.out.println("Mesleginiz :"+qa);
        } else if (itBilgisi.equals("dev")) {
            System.out.println("Mesleginiz :"+dev);
        } else if (itBilgisi.equals("ba")) {
            System.out.println("Mesleginiz :"+ba);
        } else if (itBilgisi.equals("pm")) {
            System.out.println("Mesleginiz :"+pm);
        }
    }
    }
