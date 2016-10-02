
public class Fractions {
	private int num;
	private int den;
	
	public Fractions(int num, int den){
		this.num = num;
		this.den = den;
	}
	
	public int getNum(){
		return this.num;
	}
	
	public int getDen(){
		return this.den;
	}
	
	public String add(Fractions two){
		int newNum = ((this.num * two.den) + (two.num * this.den));
		int newDen = (this.den * two.den);
		return "The total is " + newNum + "/" + newDen;
	}
	
	public String multiply(Fractions two){
		int newNum = (this.num * two.num);
		int newDen = (this.den * two.den);
		return "The prodeuct is " + newNum + "/" + newDen;
	}
	
	public String inverse(){
		return "The reciprocal of " + this.num + "/" + this.den + " is " + this.den + "/" + this.num;
	}

	
	public int findGCD(){
		int num1 = this.num;
		int num2 = this.den;
		
		if (num1 < 0){
			num1 = 0 - num1;
		}
		if (num2 < 0){
			num2 = 0 - num2;
		}
		while (num1 != num2){
			if (num1 > num2){
				num1 -= num2;
			}
			else{
				num2 -= num1;
			}
		}
		return num1;
	}
	
	public String simplify(){
		int gcd = findGCD();
		int newNum = this.num;
		int newDen = this.den;
		newNum /= gcd;
		newDen /= gcd;
		return "Simplified fraction is " + newNum + "/" + newDen;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fractions one = new Fractions(5,10);
		Fractions two = new Fractions(1,2);
		Fractions three = new Fractions(7, 22);
		System.out.println(three.findGCD());
		System.out.println(three.simplify());
	}

}
