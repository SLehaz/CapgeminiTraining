import java.util.Arrays;

class RandomNum {

    public static int generateRandomNumber() {  
        return (int) (Math.random() * 900000) + 100000;  
    }  

    public static boolean areUnique(int[] otpArray) {
        Arrays.sort(otpArray);
        
        for (int i = 0; i < otpArray.length - 1; i++) {
            if (otpArray[i] == otpArray[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateRandomNumber();
            System.out.println("Generated OTP: " + otpArray[i]);
        }

        if (areUnique(otpArray)) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Some generated OTPs are not unique.");
        }
    }
}
