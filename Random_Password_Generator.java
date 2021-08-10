import java.util.Random;
public class Random_Password_Generator 
{
    static char[] Password(int len)
    {
        System.out.println("Generating Password Using random() :-");
        System.out.print("Your New Password : ");
        String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smalls = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "@#*_+-";
        String value = capitals + smalls + numbers + symbols;
        Random ran = new Random();
        char[] password = new char[len];
        for(int i=0; i<len; i++)
        {
            password[i] = value.charAt(ran.nextInt(value.length()));
        }
        return password;
    }
    public static void main(String[] args) 
    {
        int length = 10;
        System.out.println(Password(length));
    }
}