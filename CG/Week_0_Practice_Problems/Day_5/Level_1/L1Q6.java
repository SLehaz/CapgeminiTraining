import java.util.Scanner;
class SpringSeason 
{
    void spring(int a,int b)
	{
		if((a==3)&&((b>20)&&(b<=31)))
				
		{
			System.out.println("its a Spring Season");
		}
		else if(a==4&&((b>0)&&(b<=30)))
		{
			System.out.println("its a Spring Season");
		}
		else if(a==5&&((b>0)&&(b<=31)))
		{
			System.out.println("its a Spring Season");
		}
		else if((a==6)&&(b <= 20))
		{
			System.out.println("its a Spring Season");
		}
		else 
		{
			System.out.println("its not a spring day");
		}
	}
    
    public static void main(String[] args) 
	{
        SpringSeason obj = new SpringSeason();
        Scanner s= new Scanner(System.in);
        System.out.println("enter the month:");
        int a=s.nextInt();
		System.out.println("enter the day:");
        int b=s.nextInt();
        obj.spring(a,b);
    }
}
    
