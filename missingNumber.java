import java.util.Scanner;
class missingNumber
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n,x[];
       System.out.println("Enter the size of the array");
       n=sc.nextInt();
       x = new int[n];
       System.out.println("Enter the elements of the array");
       for(int i=0;i<n;i++)
       {
        x[i]=sc.nextInt();
       }
       int count=0;
       while (count<n-1) 
       {
           int diff=x[count+1]-x[count];
           if (diff==1) 
           {
              count++;
              continue;
           } 
           else 
           {
               for(int i=1;i<diff;i++)
               System.out.print((x[count]+i)+" ");
           }
           count++;
       }
       sc.close(); 
    }
}