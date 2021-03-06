
/**
* The Main_Decryption class contains the main algorithm 
* for J256's decryption.
*
* @author  Jae Allen Reyes Nuguid
* @version 1.0
* @since   01-09-2017 
*/

package Program;

import java.util.ArrayList;

public class Main_Decryption {

	// Initial set of characters
	char[] Zs = {'|','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
			,'P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e',
			'f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ',',','.',
			'0','1','2','3','4','5','6','7','8','9','!','@','#','$','%','^','&','*','(',')','_','+','-','=','/'
			,'`','~',':',';','"','\'','<','>','?','/'};
	

	//Function: Decryption
	//Decrypts a J256 using permutation and combination techniques. Outputs a String(decrypted text).	
	public String Decryption(String x){
		
		Sub_Decryption sd = new Sub_Decryption();
		char[] dec = x.toCharArray(); 
		int j = x.indexOf("|J|");
		String jj="",bb="";
		for(int o=0; o<j;o++){
			jj+=dec[o];
		}
		int key = Integer.parseInt(jj);
		
		for(int o=j+3; o< x.length(); o++){
			bb+=dec[o];
		}
		
		char[]c = sd.Decryption(key, bb.toCharArray());
		
		x="";
		for(int d = 0; d < c.length; d++){
			x+=c[d];
		}
		
		
		String[] splitted = x.split(" ");
			
		
		String rel ="";
		
		for(int z= 0; z<splitted.length; z++){
			
			if(splitted[z].length() == 2){
				char[] y = splitted[z].toCharArray();
				String yy = y[1]+"";
				int aa= Integer.parseInt(yy);
				char h = getChar(aa);
				rel+= y[0]+""+h;
			
			}else{
				
				char y[] = splitted[z].toCharArray();
				String yy = y[1]+""+y[2];
				int aa= Integer.parseInt(yy);
				char h = getChar(aa);
				rel+= y[0]+""+h;
				
			}
			
			
		}
		String out = reSpace(rel).trim();
		return out;
		
	}
	
	//Function: reSpace
	//Identifies the spaces within the encrypted text and replace it.
	public String reSpace(String x){
		char[] l = x.toCharArray();
		for(int z=0;z<l.length;z++)
		if(l[z] == '|') l[z]=' ';
		
		String out = "";
		for(int z=0; z< l.length;z++)
			out+=l[z];
		return out;
	}
	
	
	//Function: getChar
	//Returns the corresponding character by its index.
	public char getChar(int x){
		return Zs[x];

	}
}
