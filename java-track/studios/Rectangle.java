
public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double getLength(){
		return this.length;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public double perimeter(){
		return (this.length * 2) + (this.width * 2);
	}
	
	public double area(){
		return this.length * this.width;
	}
	
	public String comparison(Rectangle two){
		if ((this.length * this.width) > (two.length * two.width)){
			return "Rectangle one is larger!";
		}
		else{
			return "Rectangle two is larger!";
		}
	}
	
	public String square(){
		if (length == width){
			return "This is a square!";
		}
		else{
			return "This is not a square. It's just a rectangle.";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle one = new Rectangle(2.0, 3.0);
		System.out.println(one.perimeter());
		System.out.println(one.area());
		Rectangle two = new Rectangle(1.0, 1.0);
		System.out.println(one.comparison(two));
		System.out.println(one.square());
	}

}
