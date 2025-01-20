import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  a number  = ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }



    }
    public static boolean isPalindrome(int n) {
        int temp = 0;
        for (int i = n; i >= 0; i--) {
            temp+=n+i;
        }
        if(temp==n){
            return true;
        } else if (temp > n && temp < n) {
            return false;

        }
      return false;
    }
}
