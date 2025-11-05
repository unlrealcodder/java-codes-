package classes;
class Product{
	String name;
	double price;
	void showProduct() {
		System.out.println(name+"-₹"+price);
	}
}

class shoppingCart {
	double total=0;
	void addProduct(Product p) {
		System.out.println(p.name+"added to cart");
		total+=p.price;
	}
	
	void checkOut() {
		System.out.println("total amount to pay ₹ "+total);
	}
}

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1=new Product();
		p1.name="headphones";
		p1.price=2000;
		p1.showProduct();
		
		shoppingCart sc1=new shoppingCart();
		sc1.addProduct(p1);
		sc1.checkOut();
		
	}

}
