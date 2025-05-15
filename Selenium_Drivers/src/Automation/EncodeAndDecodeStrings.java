package Automation;

import org.apache.commons.codec.binary.Base64;

//import org.apache.xmlbeans.impl.util.Base64;

public class EncodeAndDecodeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Alliswell@145";
		
		byte[] encodedString = Base64.encodeBase64(str.getBytes());
		
		System.out.println("Encoded String:"+new String(encodedString));
		
		byte[] decodedString = Base64.decodeBase64(encodedString);
		
		System.out.println("Decoded STring:"+new String(decodedString));
		
		
		
		
		

	}

}
