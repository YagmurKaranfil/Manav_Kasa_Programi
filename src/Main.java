import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut=2.14 , elma=3.67, domates=1.11, muz=0.95, patlican=5.00 ;
        double kiloA,kiloE,kiloD,kiloM,kiloP,tutar;

        Scanner input= new Scanner(System.in);
        System.out.print("Armut kaç kilo? : " );
        kiloA=input.nextDouble();
        System.out.print("Elma kaç kilo? : " );
        kiloE=input.nextDouble();
        System.out.print("Domates kaç kilo? : " );
        kiloD=input.nextDouble();
        System.out.print("Muz kaç kilo? : " );
        kiloM=input.nextDouble();
        System.out.print("Patlıcan kaç kilo? : " );
        kiloP=input.nextDouble();
        tutar=(kiloA*armut)+(kiloE*elma)+(kiloD*domates)+(kiloM*muz)+(kiloP*patlican);
        System.out.print("Toplam Tutar : "+ tutar);
    }
}