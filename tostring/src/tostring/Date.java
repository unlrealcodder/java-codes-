package tostring;

class Date{
     int day,month,year;

	int getDay() {
		return day;
	}

	void setDay(int day) {
		this.day = day;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	Date() {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date = [" + day + "/" + month + "/" + year + "]";
	}
	
	
     
     
}// date class ends here 


class Employee{
	public static void main(String[]args) {
		Date d1=new Date(12,2,2003);
		System.out.println(d1);
		
		Date d2=new Date(23,4,2023);
		System.out.println(d2.toString());// proof of concept
	}
}