import java.util.Scanner;

class Football
{
    public static int tallest(int[] heights)
    {
        int tallest = 0, maxheight = heights[0];

        for (int i = 0; i < heights.length; i++)
        {
            if (heights[i] > maxheight)
            {
                maxheight = heights[i];
                tallest = i;
            }
        }

        return tallest + 1;
    }

    public static int shortest(int[] heights)
    {
        int shortest = 0, minheight = heights[0];

        for (int i = 0; i < heights.length; i++)
        {
            if (heights[i] < minheight)
            {
                minheight = heights[i];
                shortest = i;
            }
        }

        return shortest + 1;
    }

    public static int sum(int[] heights)
    {
        int sum = 0;

        for (int height : heights)
        {
            sum += height;
        }

        return sum;
    }

    public static float mean(int sum)
    {
        return ((float)sum / 11);
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++)
        {
            while (true)
            {
                System.out.println("Enter the height of person " + (i + 1) + ": ");
                heights[i] = s.nextInt();

                if (heights[i] < 150 || heights[i] > 250)
                {
                    System.err.println("Please Enter a valid height. ");
                }
                else
                {
                    break;
                }
            }
        }

        int tallest = tallest(heights);
        int shortest = shortest(heights);
        int sum = sum(heights);
        float mean = mean(sum);

        System.out.println("The tallest person is Person " + tallest + ", the shortest person is Person " + shortest + ". The Sum of the heights of the team is " + sum + " and the mean height of the team is " + mean);


    }
}