import java.util.Scanner;
public class assignTaskThree
{
    static Scanner sc = new Scanner(System.in);
    static int prodID[]={1,2,3,4,5,6,7};
    static String prodList[]={"Mobile","Headphones","Tablets","Speakers","Charging cables","Adaptor","Digital watches"};
    static int prodCount[]={35,40,25,30,34,23,27};
    static String prodDetails[]={"Brands- SAMSUNG,realme,OPPO,iPhone",
                        "Wired headphones,Bluetooth headphones",
                        "Brands- SAMSUNG,realme,iPhone",
                        "Brands- Boat rockerz,Zebronics",
                        "Type A,Type C,Round pin",
                        "All type adaptors are available",
                        "Brands- Redmi smart bands,Fastracks smart watches"};
    static int prodPrice[]={26000,1500,18000,6500,1200,950,6800};
    public static void display()
    {
        System.out.println("1.Product list\n2.Product count\n3.View product details\n4.Edit product-Add products\n5.Edit product-Delete products");
        System.out.println("Enter your choice from 1 to 5: ");
        int choice=sc.nextInt();
        option(choice);
    }
    public static void option(int choice)
    {
        switch (choice)
        {
            case 1:
                System.out.println("List of the products");
                for(int i=0;i<prodList.length;i++)
                {
                    System.out.println(prodID[i]+"."+prodList[i]);
                }
                break;
            case 2:
                System.out.println("Count of each product");
                for(int i=0;i<prodCount.length;i++)
                {
                    System.out.println(prodList[i]+"-"+prodCount[i]);           
                }
                break;
            case 3:
                System.out.println("Enter the ID of the product");
                int num= sc.nextInt();
                System.out.println("Details of the product");
                System.out.println(prodList[num-1]+":\n"+prodDetails[num-1]+"\nPrice is: "+prodPrice[num-1]+"\nCount of the product available: "+prodCount[num-1]);
                break;
            case 4:
                System.out.println("Enter the ID of the Product to add the quantity");
                int num1 =sc.nextInt();
                System.out.println("Enter the quantity you want to add");
                int qua1=sc.nextInt();
                System.out.println(prodCount[num1-1]=prodCount[num1-1]+qua1);
                break;
            case 5:
                System.out.println("Enter the ID of the Product to delete the quantity");
                int num2 =sc.nextInt();
                System.out.println("Enter the quantity you want to delete");
                int qua2=sc.nextInt();
                System.out.println(prodCount[num2-1]=prodCount[num2-1]-qua2);
                break;
            default:
            System.out.println("Enter a vaild choice from 1 to 6 only");
            break;
        }
        System.out.println("Press Y to continue: "); 
        char ch=sc.next().charAt(0);
        if(ch=='y'|| ch=='Y')
        {
        display();
        } 
    }     
    public static void main(String[] args)
    {
        display();
        sc.close();
    }
}
