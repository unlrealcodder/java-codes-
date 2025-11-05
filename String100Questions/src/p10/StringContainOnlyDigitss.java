package p10;

public class StringContainOnlyDigitss {

	public static void main(String[] args) {
		String name="789";
		boolean onlyDigit=true;
		for(int i=-0;i<name.length();i++) {
			
			if(!Character.isDigit(name.charAt(i))) {
			      onlyDigit=false;
			      break;
			}
			
		}

		if(onlyDigit) {
			System.out.println(name+" contains only digits");
		}
		else {
			System.out.println(name+" does not conatain only digits");
		}
	}

}
