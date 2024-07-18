package anudip;

public class DemoString {

	public static void main(String[] args) {
		//String declaration using literal
		String name="Anudip Foundation";
		System.out.println(name);
		//Defining string using constructor
		String course=new String("APJFSA Course");
		System.out.println(course);
		char[] courseType= {'a','w','s'};
		//Defining string using character array
		String course1=new String(courseType);
		System.out.println(course1);
		System.out.println(name.concat(" Foundation"));
    	String name1=new String("anudip foundation");
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareToIgnoreCase(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		
		

	}
}