import java.util.Scanner;
public class uniqueElements
{
    public static void main(String[] args) 
    {
        int n,arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=-999)
            {
                for(int j=0;j<n;j++)
                {
                        if(i!=j)
                        {
                            if(arr[i]==arr[j])
                            {
                                arr[j]=-999;
                            }
                        }      
                }
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
