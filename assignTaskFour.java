import java.util.*;
class Product
{
  Scanner sc=new Scanner(System.in);
  final int max_prod=10;
  String prodID[]=new String[max_prod];
  String prodName[]=new String[max_prod];
  String prodDesc[]=new String[max_prod];
  int prodQty[]=new int[max_prod];
  float prodCost[]=new float[max_prod];
  int i=0;  //prodcut count variable;
  public void addProduct(String pid,String pname,String pdesc,int pqty,float pcost)
  {
     if(i>=10)
         System.out.println("No more space to add the product");
     else
     {
     	prodID[i]=pid;
     	prodName[i]=pname;
     	prodDesc[i]=pdesc;
     	prodQty[i]=pqty;
     	prodCost[i]=pcost;
     	i++;
      }
 }
 public int viewProductsCount()
  {
      return i;
  }
 public void addProdQty(String pid,int qty)
  {
      for(int j=0;j<i;j++)
      {
          if(prodID[j].equalsIgnoreCase(pid))
           {
 		prodQty[j]+=qty;
                return;
           }
      }
      System.out.println("Invalid Product ID");
  }
 public void reduceProdQty(String pid,int qty)
  {
      for(int j=0;j<i;j++)
      {
          if(prodID[j].equalsIgnoreCase(pid))
           {
 		prodQty[j]-=qty;
                return;
           }
      }
      System.out.println("Invalid Product ID");
  }
 public void viewProductDetails(String pid)
  {
     for(int j=0;j<i;j++)
      {
          if(prodID[j].equalsIgnoreCase(pid))
           {
 		System.out.println(prodID[j]+" "+prodName[j]+" "+prodDesc[j]+" "+prodQty[j]+" "+prodCost[j]);
              return;
           }
      }
      System.out.println("Invalid Product ID");

  }
public void listAllProductDetails()
  {
     if(i==0)
      System.out.println("No products are added till now");
     else
       for(int j=0;j<i;j++)
       {
          
         System.out.println(prodID[j]+" "+prodName[j]+" "+prodDesc[j]+" "+prodQty[j]+" "+prodCost[j]);
              
      }
  }
}
public class assignTaskFour
{
  public static void main(String args[])
  {
     Product p=new Product();
     Scanner sc=new Scanner(System.in);
     String pid,pname,pdesc;
     int pqty,ch;
     float pcost;
     while(true)
     {
       System.out.println("1.Add Product\n2.View Product\n3.List All Products\n4.Add Quantity\n5.Reduce Quantity\n6.Count Products\n7.Exit");
       System.out.println("Enter your choice");
     ch=sc.nextInt();
     sc.nextLine();
     switch(ch)
     {
       case 1:
               System.out.println("Enter product id to add: ");
               pid=sc.nextLine();
               System.out.println("Enter product name to add:");
               pname=sc.nextLine();
               System.out.println("Enter product description to add: ");
               pdesc=sc.nextLine();
               System.out.println("Enter product quantity to add: ");
	             pqty=sc.nextInt();
               System.out.println("Enter product cost to add: ");
	             pcost=sc.nextFloat();
               sc.nextLine();
               p.addProduct(pid,pname,pdesc,pqty,pcost);
               break;
        case 2:
               System.out.println("Enter the ID of the product to view the details: ");
	             pid=sc.nextLine();
               p.viewProductDetails(pid);
               break;
        case 3:
               p.listAllProductDetails();
	             break;
        case 4:
               System.out.println("Enter the product ID to add the quantity: ");
               pid=sc.nextLine();
               System.out.println("Enter the Quantity to add: ");
	             pqty=sc.nextInt();
	             sc.nextLine();
               p.addProdQty(pid,pqty);
               break;
        case 5:
               System.out.println("Enter the product ID to reduce the quantity: ");
               pid=sc.nextLine();
               System.out.println("Enter the Quantity to reduce: ");
               pqty=sc.nextInt();
               sc.nextLine();
               p.reduceProdQty(pid,pqty);
               break;
        case 6:
               int count=p.viewProductsCount();
               System.out.println("The total number of products: "+count);
               break;
        case 7:
               System.exit(0);
       }
       
     }
     
  }
}
