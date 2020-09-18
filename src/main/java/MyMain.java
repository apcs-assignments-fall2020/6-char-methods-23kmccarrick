import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if(ch>90||(ch>31&&ch<65))
            return ch;
        else
            return (char)(ch+32);
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String meerkat = "";
        for(int i = 0; i <str.length(); i++){
            if(str.charAt(i)>90||(str.charAt(i)>31&&str.charAt(i)<65))
                meerkat += str.charAt(i);
            else
                meerkat += (char)(str.charAt(i)+32);
        }
        return meerkat;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if(ch<97)
            return ch;
        else
            return (char)(ch-32);
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String mayrick = "";
        for(int i = 0; i <str.length();i++){
            if(str.charAt(i)<97)
                mayrick += str.charAt(i);
            else
                mayrick += (char)(str.charAt(i)-32);
        }
        return mayrick;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String result = scan.nextLine();
        System.out.println("Would you like your string uppercase or lowercase?");
        String muppet = scan.nextLine();
        if(muppet.equals("lowercase"))
            System.out.println(myToLowerCase(result));
        else
            System.out.println(myToUpperCase(result));

        
    }
}
