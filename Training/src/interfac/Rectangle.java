package interfac;

public class Rectangle implements Polygon {

	@Override
	public void getArea(int l, int b) {
		// TODO Auto-generated method stub
		int area=l*b;
		System.out.println("Area of rectangle is "+area);

	}
public static void main(String args[])
{
	
	Rectangle r=new Rectangle();
	r.getArea(5,10);
}
}
