import java.util.Scanner;
public class Caserchiper{
    public static final String alpha="abcdefghijklmnopqrstuvwxyz";
    public  static String Encrypt(String s,int shift){
        String en="";
        for(int i=0;i<s.length();i++){
            int pos= alpha.indexOf(s.charAt(i));
            int enpos=(shift+pos)%26;
            char enc=alpha.charAt(enpos);
            en=en+enc;
        }
        return en;
    }
    public static String Decrypt(String s,int shift){
        s=s.toLowerCase();
        String dn="";
        for(int i=0;i<s.length();i++){
            int pos= alpha.indexOf(s.charAt(i));
            int dnpos=(pos-shift)%26;
            if(dnpos < 0){
                dnpos=alpha.length()+dnpos;
            }
            char dnc=alpha.charAt(dnpos);
            dn=dn+dnc;
        }
        return dn;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x=0;int y=0;
        System.out.println("Enter the Input String :");
        String s= sc.nextLine();
        System.out.println("Enter the Value of the Shift :");
        int i= Integer.valueOf(sc.nextLine());
        System.out.println("Encrypt String -->"+Encrypt(s,i));
        System.out.println("Decryption Analysis :");
        while(s!=Decrypt(Encrypt(s,i),x) && x<26){
          if(x<10){
            System.out.println("   ."+x+"  ------> "+"Decrypt String : "+Decrypt(Encrypt(s,i),x));
          }
          else{
            System.out.println("   ."+x+" ------> "+"Decrypt String : "+Decrypt(Encrypt(s,i),x));
          }
          if(s.equals(Decrypt(Encrypt(s,i),x))){
            y=x;
          }
          x=x+1;
        }
        System.out.println("Key Value :" +y);
        System.out.println("Original String -->"+Decrypt(Encrypt(s,i),y));
    }
}
