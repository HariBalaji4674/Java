package Programs;

public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        int a,b,c,sum=0;

//        a = x % 10; // Quotient
//        sum = sum*10 + a;
//        x = x / 10; // Remainder
//        System.out.println(a);
//        System.out.println(x);
//        System.out.println(sum);
//
//        a = x % 10; // Quotient
//        sum = sum*10 + a;
//        x = x / 10; // Remainder
//        System.out.println(a);
//        System.out.println(x);
//        System.out.println(sum);
//
//        a = x % 10; // Quotient
//        sum = sum*10 + a;
//        x = x / 10; // Remainder
//        System.out.println(a);
//        System.out.println(x);
//        System.out.println(sum);
//
//        if (x>0){
//            a = x % 10; // Quotient
//            sum = sum*10 + a;
//            x = x / 10; // Remainder
//            System.out.println(a);
//            System.out.println(x);
//            System.out.println(sum);
//        }
        while (x > 0){
            a = x % 10; // Quotient
            sum = sum*10 + a;
            x = x / 10; // Remainder
            System.out.println(a);
            System.out.println(x);
            System.out.println(sum);
        }
        boolean Truee= Palindrome(16561);
        System.out.println(Truee);

    }
    public static boolean Palindrome(int x){
        int a=0;
        int sum = 0;
        int temp = x;
        while(x > 0){
            a = x % 10;
            sum = sum * 10 + a;
            x = x / 10;
        }
        if (sum == temp){
            return true;
        }
        else {
            return false;
        }
    }
}
