package assignment;



public class Truck extends Car{
	private int weight1;

	public Truck(int speed,
			double regularPrice,
			String color, int weight1){
		super(speed,regularPrice,color);
		this.weight1=weight;
	}

	int weight;
	double getSalePrice() {	
		if (weight1>2000) {
			System.out.println("Sale Price for truck is "+(this.regularPrice-(this.regularPrice *5/100)));
			return (this.regularPrice - (this.regularPrice *5/100));
		}
		else {  System.out.println("Sale Price for truck is "+(this.regularPrice-(this.regularPrice *10/100)));
		return (this.regularPrice-(this.regularPrice *10/100));
		}
	}
}
