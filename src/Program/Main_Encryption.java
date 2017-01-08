package Program;

import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;

public class Main_Encryption {
	
	char[] Zs = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
			,'P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e',
			'f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ',',','.',
			'0','1','2','3','4','5','6','7','8','9'};
	
	public void Encryption(String x){

		ArrayList<String> twos = new ArrayList<String>();
		
		char[] l = x.toCharArray();
		for(int z=0;z<l.length;z+=2 ){
			twos.add(l[z]+""+l[z+1]);
					}
		
	//	i love you bb ko <3
		
		for(int z=0; z<twos.size();z++){
			System.out.println(twos.get(z));
		}
	}
	
	public int getIndex(char x){
		int index ='+';
		for(int z=0; z< Zs.length; z++){ 	
			if(x == Zs[z]) index = z;
			break;
		}
		return index;

	}

}
