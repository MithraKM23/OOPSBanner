/**
*author Developer
*version 8
*/
import java.util.*;
class Hash{
	//Method to store the pattern in the HashMap
	static HashMap<Character,String[]> createcharMap(){
		HashMap<Character,String[]> charMap=new HashMap<>();
		//Storing 'O' pattern
		charMap.put('O',new String[] {
				"   ***   ",
				" **   ** ",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				" **   ** ",
				"   ***   "
            });
			//Storing 'P' pattern
		charMap.put('P',new String[] {
			"****** ",
			"**   ** ",
			"**    **",
			"**   **",
			"****** ",
			"**     ",
			"**     ",
			"**     ",
			"**     "
		});
		//Storing 'S' pattern
		charMap.put('S',new String[] {
			"   ***** ",
			" **",
			"**",
			" **",
			"   ****",
			"      **",
			"       **",
			"      **",
			"  ***** "
		});
		return charMap;
	}
	//Displaying the pattern
	static void display(String msg,HashMap<Character,String[]> map)
	{
		int len=map.get('O').length;
		for(int i=0;i<len;i++)
		{
			//creating the stringbuilder
			StringBuilder sb=new StringBuilder();
			for(char ch:msg.toCharArray())
			{
				String[] s=map.get(ch);
				sb.append(s[i]).append(" ");
			}
			//printing the stringbuilder by converting into string
			System.out.println(sb.toString());
		}
	}
		
	public static void main(String[] args){
		HashMap<Character,String[]> map=createcharMap();
		String msg="OOPS";
		display(msg,map);
}
}