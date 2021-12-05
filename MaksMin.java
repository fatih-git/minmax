import java.util.Scanner;

/**
 * @author fatih-git
 */

public class MaksMin {

    public static void main(String[] args) {

        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        int n, sayi;
        int i=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz: ");
        n=input.nextInt();

        do{

            System.out.print("Lütfen sayi girin: ");
            sayi=input.nextInt();

            if(sayi>max)
                max=sayi;

            if(sayi<min)
                min=sayi;

            i++;
        }while(i<n);

        System.out.println("Girilen değerlerden en büyüğü= "+max);
        System.out.println("Girilen değerlerden en küçüğü= "+min);

    }

}
