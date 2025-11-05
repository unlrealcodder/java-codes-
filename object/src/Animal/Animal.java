package Animal;
public class Animal{
	String animalName;
	String animalType;
	int animalAge;
	
	void sound() {
		System.out.println("this animal can sound");
	}
	

	public static void main(String[] args) {
		Animal animal1=new Animal();
		animal1.animalName="tiger";
		animal1.animalType="wild";
		animal1.animalAge=20;
		
		System.out.println(animal1.animalName);
		System.out.println(animal1.animalType);
		System.out.println(animal1.animalAge);
		animal1.sound();
		
		System.out.println();
		
		Animal animal2=new Animal();
		animal2.animalName="lion";
		animal2.animalType="wild";
		animal2.animalAge=23;
		System.out.println(animal2.animalName);
		System.out.println(animal2.animalType);
		System.out.println(animal2.animalAge);
		animal2.sound();
		
		
	}
}