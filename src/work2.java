import java.sql.SQLOutput;
import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int money = sc.nextInt();
        int thousand = 0;
        int FiveHundread = 0;
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;

        if(money>=1000){
            thousand = money/1000;
            money = money % 1000;
            System.out.println("1000 * "+ thousand);
        }
        if(money>=500){
            FiveHundread =  money / 100;
            money = money % 500;
            System.out.println("500 * "+ FiveHundread);
        }
        if(money>=100){
            hundred = money/100;
            money = money % 100;
            System.out.println("100 * "+ hundred);
        }
        if(money>=50){
            fifty = money/50;
            money = money % 50;
            System.out.println("50 * "+ fifty);

        }
        if(money>=20){
            twenty = money/20;
            money = money % 20;
            System.out.println("20 * "+ twenty);
        }
        if(money>=10){
            ten = money/10;
            money = money % 10;
            System.out.println("10 * "+ ten);

        }
        if(money>=5){
            five = money/5;
            money = money % 5;
            System.out.println("5 * "+ five);
        }
        }

    }
