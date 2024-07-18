package anudip;
public class DemoStringBuffer {

	public static void main(String[] args) {
		StringBuffer strbuff= new StringBuffer("Anudip");
		System.out.println(strbuff);
		strbuff.append("Foundation");
		System.out.println(strbuff);
		System.out.println(strbuff.reverse());
		System.out.println(strbuff.charAt(3));
		System.out.println(strbuff.indexOf("c"));
		System.out.println(strbuff.capacity());
		StringBuffer strb=new StringBuffer("Amazon Web Services in Cloud computing");
		System.out.println(strb.capacity());
		strb.deleteCharAt(7);
		System.out.println(strb);
		System.out.println(strb.codePointAt(0));
		
		System.out.println(strb.compareTo(strbuff));
		//String str ="Java";

	}

}
