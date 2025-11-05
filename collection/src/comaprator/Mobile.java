package comaprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mobile implements Comparable <Mobile> // no need to down cast in comapreto 
{
	int imei_no;
	String brand;
	double price;
	String model;
	Mobile(int imei_no, String brand, double price, String model) {
		super();
		this.imei_no = imei_no;
		this.brand = brand;
		this.price = price;
		this.model = model;
	}
	
	int getImei_no() {
		return imei_no;
	}
	void setImei_no(int imei_no) {
		this.imei_no = imei_no;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Mobile [imei_no=" + imei_no + ", brand=" + brand + ", price=" + price + ", model=" + model + "]\n";
	}

	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return this.imei_no-o.imei_no;
	}

	
	
		
		
	

	
}// mobile clsas ends here

 class Modelcompare implements Comparator<Mobile>
{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
	}
	
}


class MainDemo
{
	public static void main(String[] args) {
		List<Mobile> mobiles=new ArrayList <Mobile>();
		mobiles.add(new Mobile(101,"samsung",25000,"galaxy m29"));
		mobiles.add(new Mobile(147,"Apple",25000,"galaxy m29"));
		mobiles.add(new Mobile(1185,"LG",25000,"galaxy m29"));
		mobiles.add(new Mobile(101,"OnePlus",25000,"galaxy m29"));
	
		System.out.println("\t\t\tsorted by imei number ");
		Collections.sort(mobiles);// pass the parameter(reference of list(mobiles) in method sort of collection class 
		//System.out.println(mobiles);
		
		for(Mobile m:mobiles)
		{
			System.out.println(m);
		}
		
		System.out.println();
		
		System.out.println("\t\t\tsorted by model");
		Modelcompare  modelcom =new Modelcompare();
		Collections.sort(mobiles,modelcom);	
		//System.out.println(mobiles);
		
		for(Mobile m:mobiles)
		{
			System.out.println(m);
		}
		
		
		
		
	}
}
