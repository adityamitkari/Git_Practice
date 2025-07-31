package pwd_security_user;


import java.io.*;
import java.lang.*;
import java.util.Base64;

public class UserReg {
	
//public static void main(String[] args) {
//	
//	UserReg u1 = new UserReg();
//	
//	String result1 = u1.pwdUpper("Aditya");
//	System.out.println(result1);
//}

    public  String pwdUpper(String str1)
	{
		String result = str1.toUpperCase();
		return result;
	}
    
//    public String encode(String str2)
//    {
//    	Encoder e1 = Base64.getEncoder();
//    	String result = e1.encodeToString(str2.getBytes());
//    	return result;
//    }
    
    public int add(int a , int b )
    {
    	return a-b;
    }
}

