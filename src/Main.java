import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue=0;
        int result = 0;
        int basPow;
        int basSum = 0;
        /*while (tempNumber!=0){
            tempNumber/=10;
            basNumber++;
        }
        tempNumber = number;
        while (tempNumber!=0){
            basValue = tempNumber%10;
            basPow=1;
            for (int i=1; i<=basNumber; i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10;

        }
        if (result==number){
            System.out.println(number + " number is Armstrong number");
        }else {
            System.out.println(number + " number is not Armstrong number");
        }*/



        // ******BİR SAYININ BASAMAK SAYILARININ TOPLAMINI HESAPLAYAN PROGRAM*******
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
            System.out.println(basNumber);
        }
        tempNumber = number;
        while (tempNumber!=0){

            for (int i = 0; i <= basNumber; i++) {
                basValue = tempNumber % 10;
            }
            basSum += basValue;
            tempNumber/=10;
        }

        System.out.println(basSum);






/*
        int a = 2451;
        int basamakSayisi = 0;
        int numberCounter= 0;
        //Basamak sayisi bulma islemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a!=0){
            numberCounter++;
            a = a/10;
            System.out.println(a);
        }

        //Bir sayinin son basamagini bulma
        // 2451 % 10 = 1

        // bir sayin ustunu tapmaq
        int sub = 2, sup = 5;
        int result = 1;

        for (int i=1; i<=sup;i++){
            result*=sub;
        }
        System.out.println(result);

 */


    }
}