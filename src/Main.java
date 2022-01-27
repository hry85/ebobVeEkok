import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("n1 sayisini giriniz : ");
        int n1=sc.nextInt();

        System.out.print("n2 sayisini giriniz : ");
        int n2=sc.nextInt();

        int ebob=1;
        int ekok=1;
        int x=n1;

        for (int k=n1;k>=1;k--){
            if (n1%k==0 && n2%k==0){
                ebob=k;
                break;
            }
        }

        for (int i =1 ; i <= (n1*n2); i++){
            if (i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
        }

        System.out.println((n1*n2)/ebob);

/*
        int ebob=1;

        for (int i =1 ; i<=n1;i++){
            if (n1%i==0 && n2%i==0){
                System.out.println(i);
                ebob=i;
            }
        }
        System.out.println("------------");

        for (int k=n1;k>=1;k--){
            if (n1%k==0 && n2%k==0){
                ebob=k;
                System.out.println(ebob);
                break;
            }
        }

 */

        System.out.println("While dongusu kullanilarak");

        while (x > 1){
            if (n1 % x ==0 && n2 % x ==0){
                ebob= x;
                ekok= (n1 * n2) / ebob;
                break;
            }
            x--;

        }
        System.out.println("Ebob : " +ebob);
        System.out.println("Ekok : " +ekok);
    }

}
