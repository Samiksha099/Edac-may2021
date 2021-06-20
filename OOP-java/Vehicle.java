/*We want to store the information of different vehicles. Create a
class named Vehicle with two data member named mileage and
price. Create its two subclasses
*Car with data members to store ownership cost, warranty (by
years), seating capacity and fuel type (diesel or petrol).
*Bike with data members to store the number of cylinders,
number of gears, cooling type(air, liquid or oil), wheel
type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having
a data member to store the model type. Next, make two
subclasses Bajaj and TVS, each having a data member to store
the make-type.Now, store and print the information of an Audi and a Ford car
(i.e. model type, ownership cost, warranty, seating capacity, fuel
type, mileage and price.) Do the same e for a Bajaj and a TVS
bike.*/

public class Vehicle {
	public static void main(String args[])
	{
		Ford ford=new Ford();
		ford.carData(2300000, 5, 4, "petrol");
		System.out.println("Displaying details of Ford");
		ford.displayFord();
		System.out.println("----------------------------");
		Audi audi=new Audi();
		audi.carData(6000000, 9, 2, "diesel");
		System.out.println("Displaying details of Audi");
		audi.displayAudi();
		System.out.println("-----------------------------");
		Bajaj bajaj=new Bajaj();
		bajaj.bikeData(5, 2, 5, "air", "alloys");
		System.out.println("Displaying details of Bajaj");
		bajaj.displayBajaj();
		System.out.println("-----------------------------");
		TVS tvs=new TVS();
		tvs.bikeData(5, 2, 5, "oil", "spokes");
		System.out.println("Displaying details of TVS");
		tvs.displayTVS();
	}
}


class VehiclesInfo{
	int mileage;
	int price;
}

class Car extends VehiclesInfo{
	int ownership_cost;
	int warranty;
	int seat;
	String fule;
	void carData(int ownership_cost,int warranty,int seat,String fule) {
		this.ownership_cost=ownership_cost;
		this.fule=fule;
		this.seat=seat;
		this.warranty=warranty;
	}
}

class Bike extends VehiclesInfo{
	int gears;
	int cylinders;
	String cooling;
	String wheel_type;
	int  fuel_tank_size;
	void bikeData(int gears,int cylinders,int fuel_tank_size,String cooling,String wheel_type) {
		this.gears=gears;
	    this.cylinders=cylinders;
		this.cooling=cooling;
		this.wheel_type=wheel_type;
		this.fuel_tank_size=fuel_tank_size;
	}
}

class Ford extends Car{
	void displayFord() {
		System.out.println("ownership_cost :"+ownership_cost);
		System.out.println("warranty :"+warranty);
		System.out.println("seat :"+seat);
		System.out.println("fule :"+fule);
	}
}

class Audi extends Car{
	void displayAudi() {
		System.out.println("ownership_cost :"+ownership_cost);
		System.out.println("warranty :"+warranty);
		System.out.println("seat :"+seat);
		System.out.println("fule :"+fule);
	}
}

class Bajaj extends Bike{
	void displayBajaj() {
		System.out.println("gears :"+gears);
		System.out.println("cylinders :"+cylinders);
		System.out.println("cooling :"+cooling);
		System.out.println("wheel_type :"+wheel_type);
		System.out.println("fuel_tank_size :"+fuel_tank_size);
	}
}

class TVS extends Bike{
	void displayTVS() {
		System.out.println("gears :"+gears);
		System.out.println("cylinders :"+cylinders);
		System.out.println("cooling :"+cooling);
		System.out.println("wheel_type :"+wheel_type);
		System.out.println("fuel_tank_size :"+fuel_tank_size);
	}
}
