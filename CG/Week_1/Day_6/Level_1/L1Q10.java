import java.util.Scanner;
class UppertoLower{
    public static String tolower(String str){
        String result = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                result+=(char)(str.charAt(i) + 32);
            }
            if(str.charAt(i)==' '){
                result+=' ';
            }
        }
        return result;
    }
    public static boolean checklower(String str, String checkstr){
        String finalstr = str.toLowerCase();
        boolean flag = true;
        for(int i=0;i<str.length();i++){
            if(finalstr.charAt(i)!=checkstr.charAt(i)){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String str = s.nextLine();
        String result = tolower(str);
        boolean t = checklower(str,result);
        if(t){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}