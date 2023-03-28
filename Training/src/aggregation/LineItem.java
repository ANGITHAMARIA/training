package aggregation;

public class LineItem {
int	quantity;
Product product;
public LineItem(int quantity, Product product) {
	super();
	this.quantity = quantity;
	this.product = product;
}
public void printDetails()
{
	System.out.println("Product details are.......\nName:"+product.name+
			"\nID:"+product.id+
			"\nDescription:"+product.description+"\nQuantity:"+quantity);
}
public static void main(String args[])
{
Product p=new Product(1,"TestName","TestDescription");
LineItem l=new LineItem(10,p);
l.printDetails();
}
}
