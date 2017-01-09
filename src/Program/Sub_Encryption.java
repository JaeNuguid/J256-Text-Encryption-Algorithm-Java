
/**
* The Sub_Encryption class contains the shifting algorithm 
* and key generation for J256's encryption.
*
* @author  Jae Allen Reyes Nuguid
* @version 1.0
* @since   01-09-2017 
*/


package Program;

public class Sub_Encryption {

	public int key =0, key0 = 0;;
	char[] x;
	

	//Function: Encryption
	//Genearates a key, encrypts the semi-encrypted J256, returns a String(encrypted text).
	public char[] Encryption(char[] x){
		this.x = x;
		
			key = generateKey();
		
		
			for (int z = 0; z < key; z++)
			{
				  jShifter(x); 
			}
		
		return x;		
	}
	
	//Function: jShifter
	//Shifts the characters to its corresponding number of loop.
	 public void jShifter(char[] p)
     {
        
             for (int x = 0; x < p.length; x++)
             {
                 if (p[x] >= '0' && p[x] <= '9')
                 {
                     for (int y = 0; y < key0; y++)
                     {
                         p[x]++;
                         if (p[x] > '9') p[x] = '0';

                     }  
                     key0++;
                 }
                 else if (p[x] >= 'A' && p[x] <= 'Z')
                 {
                     for (int y = 0; y < key0; y++)
                     {
                         p[x]++;

                         if (p[x] > 'Z') p[x] = 'A';

                     }
                     key0++;
                 }
                 else if (p[x] >= 'a' && p[x] <= 'z')
                 {

                     for (int y = 0; y < key0; y++)
                     {

                         p[x]++;
                         if (p[x] > 'z') p[x] = 'a';
                     }
                     key0++;
                 }                                                                                                
                 else if (p[x] == ' ')
                 {
                     p[x] = '\\';
                     key0++;
                 }

                 if (key0 > 9) key0 = 0;
             }
         }
	
	 //Function: generateKey
	 //Generates and returns an integer ranging from 32 to 256.
	public int generateKey(){
		return (int)(Math.random()*256)+32;
				
	}
	
	
}
