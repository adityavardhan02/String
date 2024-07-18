package apjfsa;

public class DemoStringBuilder {

	public static void main(String[] args) {
		StringBuilder strb=new StringBuilder("Hello world");
		
		System.out.println(strb);
		System.out.println(strb.length());
		System.out.println(strb.length());
		System.out.println(strb.indexOf("o"));
		//String s=strb.tostring();
		//System.out.println(s);
		StringBuffer srtb1=new StringBuffer(strb);
		System.out.println(strb);

	}

}
