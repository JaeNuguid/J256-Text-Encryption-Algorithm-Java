package Program;

import java.util.ArrayList;

public class Main_Decryption {
	char[] Zs = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
			,'P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e',
			'f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ',',','.',
			'0','1','2','3','4','5','6','7','8','9','!','@','#','$','%','^','&','*','(',')','_','+','-','=','/'
			,'`','~',':',';','"','\'','<','>','?','/'};
	
	public void Decryption(String x){
		
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
				System.out.println(yy+"");
				int aa= Integer.parseInt(yy);
				char h = getChar(aa);
				rel+= y[0]+""+h;
				
			}
			
			
		}
		
		System.out.println("Decrypted Text: "+rel+"\n");
		
	}
	
	
	
	public char getChar(int x){
		return Zs[x];

	}
}
