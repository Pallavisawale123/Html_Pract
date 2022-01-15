import java.util.*;

class Prime
{
     
       public static void prime(int n)
       {
           int isum=1,i=0;

           for( i=2;i<n/2;i++)
         {
             if(n%i==0)
             {
                 isum=isum+i;
              }
         }

          if(isum==1)
          {
             System.out.println("it is prime number");

           }

           else{
            System.out.println("not prime no ");
          }
       }
       public static void fact(int n)
       {
           int ifact=1;
           for(int i=2;i<=n;i++)
           {
               ifact=ifact*i;

           }
           System.out.println(ifact);
       }
       public static void MonthRe(int m){
           String mm;
        switch (m)
         {
            case 1: mm = "January";
                     break;
            case 2: mm = "February";
                     break;
            case 3: mm = "March";
                     break;
            case 4: mm = "April";
                     break;
            case 5: mm = "May";
                     break;
            case 6: mm = "June";
                     break;
            case 7: mm = "July";
                     break;
            case 8: mm = "August";
                     break;
            case 9: mm = "September";
                     break;
            case 10: mm = "October";
                     break;
            case 11: mm = "November";
                     break;
            case 12: mm = "December";
                     break;
            default: mm = "Invalid month";
                     break;
        }
        System.out.println(mm);
           
       }
    public static void main(String args[])
    {
      
        int  n=11;
       // isum=1,i=0;

        prime(n);
        fact(3);
        MonthRe(4);
        

    }
}