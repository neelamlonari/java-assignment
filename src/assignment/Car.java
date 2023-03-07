package assignment;


public class Car {
	int speed;
	double regularPrice;
	String color;

	public Car(int speed,double regularPrice,String color){
		
		this.color=color;
		this.speed=speed;
		this.regularPrice=regularPrice;
	}
	
	double getSalePrice() {
		System.out.println("Sale Price for car is " + regularPrice);
		return regularPrice;

	}

}
