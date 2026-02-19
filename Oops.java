/**
*author Developer
*version 7
*/
class GetCharacter{
	static class Pattern{
		//Pattern - Inner class for storing the pattern
		//Method to create O pattern
	public static String[] getopattern(){
			return new String[]{
				"   ***   ",
				" **   ** ",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				" **   ** ",
				"   ***   "
            };				
		  }
	//Method to create P pattern
	public static String[] getppattern(){
		return new String[]{
			"****** ",
			"**   ** ",
			"**    **",
			"**   **",
			"****** ",
			"**     ",
			"**     ",
			"**     ",
			"**     "
		};
	}
	//Method to create S pattern
	public static String[] getspattern(){
		return new String[]{
			"   ***** ",
			" **",
			"**",
			" **",
			"   ****",
			"      **",
			"       **",
			"      **",
			"  ***** "
		};
	}
	}
	}
	class Main{
		public static void main(String[] args){
			GetCharacter.Pattern pattern=new GetCharacter.Pattern();
			String opattern[] = pattern.getopattern();
			String ppattern[] = pattern.getppattern();
			String spattern[] = pattern.getspattern();
			for(int i=0;i<opattern.length;i++){
			 System.out.println(opattern[i]+"  "+opattern[i]+"  "+ppattern[i]+"  "+spattern[i]);
		 }
	}
}
	  