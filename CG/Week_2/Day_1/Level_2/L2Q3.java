import java.util.Scanner;
class PalindromeChecker{
    String text;
    public void addText(String text){
        this.text=text;
    }
    public boolean palindrome(){
        String text = this.text;
        int j=text.length()-1;
        for(int i=0;i<=text.length()/2;i++){
            if(i>j){
                return true;
            }
            if(text.charAt(i)!=text.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
public class L2Q3{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        PalindromeChecker p = new PalindromeChecker();
        System.out.println("Enter the text : ");
        String text = s.next();
        p.addText(text);
        if(p.palindrome()==true){
            System.out.println("The text is a palindrome");
        }
        else{
            System.out.println("The text is not a palindrome");
        }
        s.close();
    }
}