package blcprogram;

public class Product {

 
String ProductName;
 int ProductId;
 double ProductPrice;
 
	public void setProduct(int id,String name,double price) {
		
		
		ProductName=name;
		ProductId=id;
		 ProductPrice= price;
		 
		
		
	}
	public void getProductInfo() {
		
		System.out.println("Enter Product Name is:"+ProductName);
	  
		System.out.println("Enter Product Id is:"+ProductId);
		
		System.out.println("Enter Product Price is:"+ ProductPrice);
		
		
	}

	}


