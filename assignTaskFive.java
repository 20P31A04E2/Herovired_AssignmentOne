import java.io.*;
class assignTaskFive
{
  public static void main(String args[])
  {
     String line=null;
     int transac=0;
     Double totalBill=0.00;
     Double MinAmount=999999.00;
     Double MaxAmount=0.00;
     try   
	  {  
        BufferedReader br = new BufferedReader(new FileReader("D:/java_hv/sample.csv"));  
        while ((line = br.readLine()) != null)   
        {  
            String[] transcation = line.split(",");
            transac++;   
            Double d=Double.parseDouble(transcation[3]);
            totalBill+=d;
            if(d>MaxAmount)
              MaxAmount=d;
            if(d<MinAmount)
              MinAmount=d;
        } 
	}   
	catch (IOException e)   
	{  
		e.printStackTrace();  
	}  
	    System.out.println("Total Number of transcationss: "+transac);
      System.out.println("The maximum bill amount is: "+MaxAmount);
      System.out.println("The minimum bill amount is: "+MinAmount);
      System.out.println("Total bill: "+totalBill);
  }
}