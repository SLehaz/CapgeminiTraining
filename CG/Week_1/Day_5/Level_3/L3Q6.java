import java.util.Scanner;

class NumCheck {
    
    public static int[] findFactors(int n) {  
    int[] factors = new int[n];
    int count = 0;  

    
    for (int i = 1; i <= n; i++) {  
        if (n % i == 0) {  
            factors[count] = i; 
            count++;  
        }  
    }  

    
    int[] result = new int[count];  
    for (int i = 0; i < count; i++) {  
        result[i] = factors[i];   
    }  
    
    return result;  
}   

    
    public static int greatestFactor(int[] factors) {  
        return factors[factors.length - 1]; 
    }  

   
    public static int sumOfFactors(int[] factors) {  
        int sum = 0;  
        for (int factor : factors) {  
            sum += factor;  
        }  
        return sum;  
    }  

    
    public static int productOfFactors(int[] factors) {  
        int product = 1;  
        for (int factor : factors) {  
            product *= factor;  
        }  
        return product;  
    }  

    public static double productOfCubesOfFactors(int[] factors) {  
        double product = 1;  
        for (int factor : factors) {  
            product *= Math.pow(factor, 3);  
        }  
        return product;  
    }  

    public static boolean isPerfectNumber(int n) {  
        int sum = sumOfFactors(findFactors(n)) - n; 
        return sum == n;  
    }  

 
    public static boolean isAbundantNumber(int n) {  
        int sum = sumOfFactors(findFactors(n)) - n; 
        return sum > n;  
    }  

     
    public static boolean isDeficientNumber(int n) {  
        int sum = sumOfFactors(findFactors(n)) - n;   
        return sum < n;  
    }  

    public static boolean isStrongNumber(int n) {  
        int originalNumber = n;  
        int sumOfFactorials = 0;  

        while (n > 0) {  
            int digit = n % 10;  
            sumOfFactorials += factorial(digit);  
            n /= 10;  
        }  

        return sumOfFactorials == originalNumber;  
    }  

   
    private static int factorial(int num) {  
        int result = 1;  
        for (int i = 1; i <= num; i++) {  
            result *= i;  
        }  
        return result;  
    }  

    public static void main(String[] args) {  
        Scanner scn = new Scanner(System.in);  
        System.out.println("Please enter a number:");  
        int n = scn.nextInt();  

        int[] factors = findFactors(n);  
        System.out.println("Factors of " + n + ": " + java.util.Arrays.toString(factors));  
        System.out.println("Greatest factor: " + greatestFactor(factors));  
        System.out.println("Sum of factors: " + sumOfFactors(factors));  
        System.out.println("Product of factors: " + productOfFactors(factors));  
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));  
        System.out.println(n + (isPerfectNumber(n) ? " is a perfect number." : " is not a perfect number."));  
        System.out.println(n + (isAbundantNumber(n) ? " is an abundant number." : " is not an abundant number."));  
        System.out.println(n + (isDeficientNumber(n) ? " is a deficient number." : " is not a deficient number."));  
        System.out.println(n + (isStrongNumber(n) ? " is a strong number." : " is not a strong number."));  

        scn.close();  
    }  
}  