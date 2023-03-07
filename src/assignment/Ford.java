package assignment;

public class Ford extends Car{
	private int year1;
	private int manufactureDiscount1;

public  Ford(int speed,
			double regularPrice,
			String color,int year,int manufactureDiscount1){
		super(speed,regularPrice,color);
		this.year1 = year;
		this.manufactureDiscount1 = manufactureDiscount1;
	}
	
//	public Ford(int speed, int regularPrice, String color, int year2, int manufactureDiscount2) {
//		// TODO Auto-generated constructor stub
//		super( speed,  regularPrice,  color);
//	this.year2=year2;
//		this.manufactureDiscount2 = manufactureDiscount2;
//	}

	int year;
	int manufactureDiscount;
	public double getSalePrice() {
		
		System.out.println("Sale Price for Ford is :" +( regularPrice - manufactureDiscount1));
		return (this.regularPrice - this.manufactureDiscount1);
	}
}

