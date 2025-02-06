public class Demo059 {

    public static boolean isPrime(int number) {
        
        if (number <= 1) {
            return false; 
        }
        
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int number = 29; 
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}