package String_programs;

public class reversstrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="Naveenkumar";
       String rev="";
       for(int i=s.length()-1; i>=0;i--)
       {
    	   rev=rev+s.charAt(i);  
       }
       System.out.println("reverse of string is:"+ rev);
	}

}
