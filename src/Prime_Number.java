import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a prime number =");
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("Prime number");
        }else {
            System.out.println("not prime");
        }


    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }

        }
        return true;
    }
}
