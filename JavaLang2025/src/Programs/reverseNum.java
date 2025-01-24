package Programs;

public class reverseNum {
    public static void main(String[] args) {
        System.out.println("Reversing Number");
        System.out.println(revNum(1345431));
    }

    public static int revNum(int x){
        int sum = 0,a , temp = x, count=0;

        while(x>0){
            a = x%10;
            sum = sum*10 + a;
            x = x/10;
            count++;
        }
        if(temp == sum){
            System.out.println("The numbers are same");
        }
        else {
            System.out.println("The Numbers are not same");
        }
        System.out.println(count);
        return sum;
    }
}
