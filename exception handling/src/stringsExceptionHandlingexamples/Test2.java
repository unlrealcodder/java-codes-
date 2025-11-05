package stringsExceptionHandlingexamples;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
			String name =null;
			  System.out.println(name.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
          
          
          
         String name1="mahesh";
          // string is immutable so convert string into stringbuilder
          StringBuilder sb=new StringBuilder(name1);
         
          sb.setCharAt(sb.length()-1,'w');
          System.out.println(sb);
          
          try {
			sb.setCharAt(sb.length(), 'u');
			  System.out.println(sb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
