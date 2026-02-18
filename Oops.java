/**
*OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
*
*This use case extends UC5 by implementing a modular approach to generate each letter's pattern through
*dedicated methods.
*@author Developer
*@version 6
*/
class Oops{
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
		
    public static void main(String[] args){
		  
		 String opattern[]=getopattern();
		 String ppattern[]=getppattern();
		 String spattern[]=getspattern();
		 for(int i=0;i<opattern.length;i++){
			 System.out.println(opattern[i]+"  "+opattern[i]+"  "+ppattern[i]+"  "+spattern[i]);
		 }
		
		
}
}