package assignment;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Car sedan = new Sedan(20,10000,"blue",20);
		Car sedan1 = new Sedan(45,15000,"Pink",25);
		sedan.getSalePrice();
		sedan1.getSalePrice();
		//Create two instances of the Ford class and initialize all the fields with appropriate values.
		Car ford = new Ford( 70, 15000,"Red",2021,3000);
		Car fordSuv = new Ford(80,20000,"white",2023,1500);
		ford.getSalePrice();
	   fordSuv.getSalePrice();
	   
	  // Create an instance of the Car class and initialize all the fields with appropriate values.
      Car nissan = new Car(80,25000,"skyblue");
      nissan.getSalePrice();
      Car truck = new Truck(55, 50000, "brown",3000);
      truck.getSalePrice();
	}

}
/*Create an instance of the Sedan class and initialize all the fields with appropriate values.
 *  Use super(...) method in the constructor for initializing the fields of the superclass.
 
Create two instances of the Ford class and initialize all the fields with appropriate values. 
Use super(...) method in the constructor for initializing the fields of the super class.
Create an instance of the Car class and initialize all the fields with appropriate values.
Display the sale prices of all instances.*/