package Program;

import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;

public class Main_Encryption {
	
	char[] Zs = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
			,'P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e',
			'f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ',',','.',
			'0','1','2','3','4','5','6','7','8','9','!','@','#','$','%','^','&','*','(',')','_','+','-','=','/'
			,'`','~',':',';','"','\'','<','>','?','/'};
	
	public void Encryption(String x){

		ArrayList<String> twos = new ArrayList<String>();
		
		char[] l = x.toCharArray();
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
		
		for(int z=0; z<twos.size();z++){
			System.out.print(twos.get(z));
			if(z<twos.size()-1){
				System.out.print(" ");
			}
		}
	}
	
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
