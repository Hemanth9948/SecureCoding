import java.io.*;
public class One{
	public static String Encrypt(String pt,String key){
	  String ct="";
	  int  n[] = new int[key.length()];
	  for(int i=0;i<key.length();i++){
	    n[i]=pt.charAt(i)-'A'+key.charAt(i)-'A';
	    if(n[i]>25){
	      n[i]=n[i]-26;
	    }
	  }
	  for(int i=0;i<key.length();i++){
	    int x=n[i]+'A';
	    ct+=(char)x;
	    }
	  return ct;
	}
	public static String Decrypt(String ct,String key){
	  String pt="";
	  int  n[] = new int[key.length()];
	  for(int i=0;i<key.length();i++){
	    n[i]=ct.charAt(i)-'A'-(key.charAt(i)-'A');
	    if(n[i]<0){
	      n[i]=n[i]+26;
	    }
	  }
	  for(int i=0;i<key.length();i++){
	    int x=n[i]+'A';
	    pt+=(char)x;
	    }
	  return pt;
	}
	public static void main(String args[]){
	String pt="Hello";
	String key="Money";
	System.out.println("Encrypted Message ---->"+Encrypt(pt.toUpperCase(),key.toUpperCase()));
	System.out.println("Decrypted Message ---->"+Decrypt(Encrypt(pt.toUpperCase(),key.toUpperCase()),key.toUpperCase()));
	}
}
