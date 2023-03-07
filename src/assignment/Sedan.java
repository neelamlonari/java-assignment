package assignment;



public class Sedan extends Car{
	private int length;

	public Sedan(int speed,
			double regularPrice,
			String color,int length){
		super(speed,regularPrice,color);
		this.length=length;
	}
	public double getSalePrice() {
		if (length>20) {
			System.out.println("SalePrice for Sedan is "+ ( regularPrice - (this.regularPrice*5/100)));
			return (this.regularPrice*5/100);

		}else {
			System.out.println("SalePrice for Sedan is "+ (regularPrice-(this.regularPrice*10/100)));

			return (this.regularPrice * 10/100);
		}
	}
}
