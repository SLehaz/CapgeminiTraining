import java.util.Scanner;
class Palindrome{
    public static boolean regularPalindrome(String str){
        String text="";
        for(int i=str.length()-1;i>=0;i--){
            text+=str.charAt(i);
        }
        if(text.equals(str)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean recursivePalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        else {
            start++;
            end--;
            recursivePalindrome(str, start, end);
        }
        return true;
    }
    public static boolean characterPalindrome(String str){
        char[] ch = new char[str.length()],chr = new char[str.length()];
        int j=str.length()-1;
        for(int i=0;i<str.length();i++){
            ch[i]=str.charAt(i);
            chr[j]=str.charAt(i);
            j--;
        }
        j=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]!=chr[j++]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = s.next();
        boolean result1 = regularPalindrome(str);
        boolean result2 = recursivePalindrome(str,0,str.length()-1);
        boolean result3 = characterPalindrome(str);
        if((result1) && (result2) && (result3)){
            System.out.println("The string \""+str+"\" is a palindrome");
        }
        else{
            System.out.println("The string "+str+" is not a palindrome");
        }
        s.close();
    }
}