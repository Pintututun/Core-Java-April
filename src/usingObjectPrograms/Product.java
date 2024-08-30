package usingObjectPrograms;

import java.util.Scanner;

public class Product {
  int  productCode;
  String productName;
  double productQuantity;
  double price;
  String expiryDate;
  double totalPrice;
  public void acceptProductProperties()
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter product code--");
	 productCode=sc.nextInt();
	 System.out.println("Enter product name--");
	 productName=sc.next();
	 System.out.println("Enter product quantity--");
	 productQuantity=sc.nextDouble();
	 System.out.println("Enter price in rupees--");
	 price=sc.nextDouble();expiryDate=sc.nextLine();
	 System.out.println("Enter the expiry date--");
	 expiryDate=sc.nextLine();
	 sc.close();
  }
  public void totalPriceOfProduct()
  {
	  totalPrice=productQuantity*price;
  }
  public void displayProductProperties()
  {
	  System.out.println("The product code is "+productCode);
	  System.out.println("The product name is "+productName);
	  System.out.println("The product quantity is "+productQuantity);
	  System.out.println("The product price is Rs"+price);
	  System.out.println("The expiry date is "+expiryDate);
	   System.out.println("Total Price is Rs"+totalPrice);
  }
  public static void main(String [] args)
  {
	  Product obj=new Product();
	  obj.acceptProductProperties();
	  obj.totalPriceOfProduct();
	  obj.displayProductProperties();
	  
  }
}
