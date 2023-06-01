import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner girdi = new Scanner(System.in)) {



            /* 
            int a,faktöriyel=1;

            System.out.println("Faktöriyelini almak istediğiniz sayiyi giriniz.");
            a=girdi.nextInt();

            if(a==0)
            {
                System.out.println("Cevap: "+faktöriyel);
            }

            for(int i=1; i<=a ; i++)
            {
                faktöriyel=faktöriyel*i;
                
            }
            System.out.println("Cevap: "+faktöriyel);
            */
       
/* 
            int a,i,k;


            System.out.println("Üçgen boyutunuzuz yükseliği kaç olsun");
            a=girdi.nextInt();

            for(i=1;i<=a; i++)
            {
                for(k=1;k<=i;k++)
                {   
                    System.out.print("*");
                    
                }
                System.out.print("\n");
            }
*/

            int a,b,i=1,sonuc=1;

            System.out.println("Sayıyı ve kaçıncı üssü almak istediğinizi giriniz.");
            a=girdi.nextInt();
            b=girdi.nextInt();

            if(b==0)
            {
                System.out.println("Cevap: 1");
            }
            
       while(i<=b)
       {
        
        sonuc=sonuc*a;
        i++;
        
       }

       System.out.println("Cevap: "+sonuc);
       
              
       

       
       
        }















    }
}
