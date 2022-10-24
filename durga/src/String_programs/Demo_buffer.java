package String_programs;

public class Demo_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      StringBuffer sb = new StringBuffer("Naveen");
//      sb.append("kumar");
//      System.out.println(sb);

		String s = "NAVEEN";
		int leng = s.length(); // lenth 6
		String rev = "";
		for (int i = leng - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

}
