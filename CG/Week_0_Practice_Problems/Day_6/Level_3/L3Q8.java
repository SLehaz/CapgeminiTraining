import java.util.Scanner;
class Anagram{
    public static int[] findFrequency(String str){
        char[] ch = str.toCharArray();
        String unique = Character.toString(ch[0]);
        int flag=1;
        for(int i=1;i<ch.length;i++){
            for(int j=0;j<i;j++){
                if(ch[i]==ch[j]){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                unique+=ch[i];
            }
        }
        char[] uniq = unique.toCharArray();
        for(int i=0;i<uniq.length;i++){
            for(int j=0;j<uniq.length;j++){
                if(uniq[i]>uniq[j]){
                    char temp = uniq[i];
                    uniq[i]=uniq[j];
                    uniq[j]=temp;
                }
            }
        }
        int[] freq = new int[uniq.length];
        for(int i=0;i<uniq.length;i++){
            int c=0;
            for(int j=0;j<ch.length;j++){
                if(uniq[i]==ch[j]){
                    c++;
                }
            }
            freq[i]=c;
        }
        return freq;
    }
    public static boolean findAnagram(int[] freq1,int[] freq2){
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 texts :");
        String text1 = s.next() , text2 = s.next();
        if(text1.length()!=text2.length()){
            System.out.println("The two strings are not an anagram");
        }
        else{
            int[] freq1 = findFrequency(text1);
            int[] freq2 = findFrequency(text2);
            boolean result = findAnagram(freq1,freq2);
            if (result) {
                System.out.println("The given strings are Anagrams");
            }
            else{
                System.out.println("The given strings are not Anagrams");
            }
        }
    }
}