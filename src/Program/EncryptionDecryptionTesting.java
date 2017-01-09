package Program;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncryptionDecryptionTesting {

	@Test
	public void encryptDecryptTest() {
		String test1 = "This is an example of a String";
		String test2 = "123456789 testing";
		String test3 = "Encryption and Decryption testing";
		String test4 = "J256 Algorithm Testing";
		String test5 = "Programmer: Jae Allen Reyes Nuguid";
		

		Main_Encryption encrypt = new Main_Encryption();
		Main_Decryption decrypt = new Main_Decryption();

		String test1e = encrypt.Encryption(test1);
		String test2e = encrypt.Encryption(test2);
		String test3e = encrypt.Encryption(test3);
		String test4e = encrypt.Encryption(test4);
		String test5e = encrypt.Encryption(test5);
		
		String test1d = decrypt.Decryption(test1e);
		String test2d = decrypt.Decryption(test2e);
		String test3d = decrypt.Decryption(test3e);
		String test4d = decrypt.Decryption(test4e);
		String test5d = decrypt.Decryption(test5e);

		assertEquals(test1,test1d);
		assertEquals(test2,test2d);
		assertEquals(test3,test3d);
		assertEquals(test4,test4d);
		assertEquals(test5,test5d);
		
	}

}
