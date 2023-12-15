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
        System.out.println("Enter the Input String :");
        String s= sc.nextLine();
        System.out.println("Enter the Value of the Shift :");
        int i= Integer.valueOf(sc.nextLine());
        System.out.println("Encrypt String -->"+Encrypt(s,i));
        System.out.println("Decrypt String -->"+Decrypt(Encrypt(s,i),i));
    }
}
