package day01_IfStatement_TernaryOperator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q06koordinatNoktasi {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız

        Scanner scan=new Scanner(System.in);

        System.out.println("X ve Y koordinat degerlerini giriniz");
        int x= scan.nextInt();
        int y= scan.nextInt();

        if (x>0 && y>0){
            System.out.println("1. bolgedesiniz");
        } else if (x<0 && y>0) {
            System.out.println("2. bolgedesiniz");
        }else if (x<0 && y<0) {
            System.out.println("3. bolgedesiniz");
        }else if (x>0 && y<0) {
            System.out.println("4. bolgedesiniz");
        }else if (x!=0 && y==0) {
            System.out.println("x ekseniz uzerindesiniz");
        }else if (x==0 && y!=0) {
            System.out.println("y ekseni uzerindesiniz");
        }else {
            System.out.println("Orjindesiniz");
        }








    }
}