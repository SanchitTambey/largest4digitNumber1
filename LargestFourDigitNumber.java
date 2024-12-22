public class LargestFourDigitNumber {
    public static void main(String[] args) {
      
        int largest4DigitNumber = 9999;

        int LCM = 130;
        
        int result = largest4DigitNumber - (largest4DigitNumber % LCM);

        System.out.println("The largest 4-digit number divisible by 10 and 13 is: " + result);
    }
}
