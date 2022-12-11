import java.util.Scanner;

public class usstt {
    public static void main(String[] args) {
        int a, b;
        Scanner num = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz:");
        a = num.nextInt();
        System.out.print("üs olacak sayıyı giriniz:");
        b = num.nextInt();

        //a^b= a.a.a(b kadar ay sayıysı yan yana acarpılır .)



        int total = 1;
        for (  int i = 1; i <= b; i++){
            total *=a;
        }
        System.out.print("Sonuç : " + total);


    }
}
