import java.util.Scanner;
class Vote{
    public static int[] getAge(int n){
        int[] age = new int[n];
        for(int i=0;i<n;i++){
            age[i] = (int)(10 + (Math.random()*90)%90);
        }
        return age;
    }
    public static String[][] checkAge(int[] age,int n){
        String[][] voteage = new String[n][2];
        for(int i=0;i<n;i++){
            if(age[i]<18){
                voteage[i][0]= String.valueOf(age[i]);
                voteage[i][1]= String.valueOf(false);
            }
            else{
                voteage[i][0]=String.valueOf(age[i]);
                voteage[i][1]=String.valueOf(true);
            }
        }
        return voteage;
    }
    public static void display(String[][] voteage){
        System.out.println("Person \t Age \t Eligibility");
        for(int i=0;i<voteage.length;i++){
            if(Boolean.parseBoolean(voteage[i][1])==true){
                System.out.println((i+1)+"\t"+voteage[i][0]+"\t Can Vote");
            }
            else{
                System.out.println((i+1)+"\t"+voteage[i][0]+"\t Cannot Vote");
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of people : ");
        int n = s.nextInt();
        int[] age = getAge(n);
        String[][] voteage = checkAge(age,n);
        display(voteage);
    }
}