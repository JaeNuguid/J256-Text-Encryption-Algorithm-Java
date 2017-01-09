
/**
* The Main_Encryption class contains the main algorithm 
* for J256's encryption.
*
* @author  Jae Allen Reyes Nuguid
* @version 1.0
* @since   01-09-2017 
*/


package Program;

import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;


public class Main_Encryption {
	
	// Initial set of characters
	char[] Zs = {'|','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
			,'P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e',
			'f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ',',','.',
			'0','1','2','3','4','5','6','7','8','9','!','@','#','$','%','^','&','*','(',')','_','+','-','=','/'
			,'`','~',':',';','"','\'','<','>','?','/'};
	
	//Possible upgrade for this algorithm lies within this set of characters.
	//Changing the initial set's arrangement by its corresponding key.
	
	
	
	//Function: Encryption
	//Encrypts a string using permutation and combination. Outputs a String(encrypted text).
	public String Encryption(String x){
		
		if(x.contains("|J|")) return "error";

		ArrayList<String> twos = new ArrayList<String>();
		
		char[] l = x.toCharArray();
		for(int z=0; z<l.length;z++){
			if(l[z] ==' ') l[z] ='|';
		}
		
		
		if((l.length)%2 !=0){
			char[] ll = new char[l.length+1];
			for(int z=0; z< l.length;z++){
				ll[z] = l[z];
			}
			ll[ll.length-1] = ' ';
			
			for(int z=0;z<ll.length;z+=2 ){
				twos.add(ll[z]+""+getIndex(ll[z+1]));
						}
		}else{
		for(int z=0;z<l.length;z+=2 ){
			twos.add(l[z]+""+getIndex(l[z+1]));
					}
		}
		String out ="";
		for(int z=0; z<twos.size();z++){
		out+=twos.get(z);
			if(z<twos.size()-1){
				out+=" ";
			}
		}
		
		
		Sub_Encryption se = new Sub_Encryption();
		char[] z = se.Encryption(out.toCharArray());
		out="";
		for(int c=0;c < z.length;c++){
			out+=z[c];
		}
		
		String J256 =se.key+"|J|"+out;
		return J256.trim();
	}
	
	//Function: getIndex
	//Identifies and returns the corresponding index of a character.
	public int getIndex(char x){
		int index =0;
		for(int z=0; z< Zs.length; z++){ 	
			if(x == Zs[z]){ 
				index = z;
				break;
			}
		}
		return index;

	}

}
