import java.util.Scanner;
class SPS{
    public static int[] valuesRandom(int n){
        int[] computerchoice = new int[n];
        for(int i=0;i<n;i++){
            computerchoice[i] = (int)(1+Math.random()*10)%3;
        }
        return computerchoice;
    }
    public static void findWinner(int[] computerchoice, int n){
        int[] winner = new int[2];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Enter your move within 0 to 2 :");
            int human = s.nextInt();
            System.out.println("Game "+(i+1)+" : ");
            while(true){
                if(human==0 && computerchoice[i]==1){
                    winner[0]++;
                    System.out.println("Computer wins!");
                    break;
                }
                else if(human==1 && computerchoice[i]==0){
                    winner[1]++;
                    System.out.println("Human wins!");
                    break;
                }
                else if(human==0 && computerchoice[i]==2){
                    winner[1]++;
                    System.out.println("Human wins!");
                    break;
                }
                else if(human==2 && computerchoice[i]==0){
                    winner[0]++;
                    System.out.println("Computer wins!");
                    break;
                }
                else if(human==1 && computerchoice[i]==2){
                    winner[0]++;
                    System.out.println("Computer wins!");
                    break;
                }
                else if(human==2 && computerchoice[i]==1){
                    winner[1]++;
                    System.out.println("Human wins!");
                    break;
                }
                else{
                    System.out.println("Draw..");
                    break;
                }
            }
            String[] avg = findAverage(winner,i+1);
            display(avg);
        }
        s.close();
    }
    public static String[] findAverage(int[] winner,int a){
        String[] avg = new String[4];
        avg[0]=String.valueOf((float)(winner[0])/a);
        float b = ((float)(winner[0])/a)*100;
        avg[1]=String.valueOf(b+"%");
        avg[2]=String.valueOf((float)(winner[1])/a);
        float c = ((float)(winner[1])/a)*100;
        avg[3]=String.valueOf(c+"%");
        return avg;
    }
    public static void display(String[] avg){
        System.out.println("Computer : Average wins = "+avg[0]+" Percentage of wins : "+avg[1]);
        System.out.println("Human : Average wins = "+avg[2]+" Percentage of wins : "+avg[3]);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of games:");
        int n = s.nextInt();
        int[] computerchoice = valuesRandom(n);
        findWinner(computerchoice,n);
        s.close();
    }
}