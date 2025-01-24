package Programs;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Printing Even Numbers : ");
        int i = 0;
        while (i<10)
        {
            System.out.println(i);
            i+=2;
        }
        i = 0;
        while(i<=10){
            if (i % 2 == 0){
                System.out.println(i + " Even");
            }else {
                System.out.println(i + " Odd");
            }
            i++;
        }

        i = 10;
        do {
            System.out.println(i);
            i--;
        }while(i > 0);
        //for (initialization; condition; increment/decrement)
        for (i = 5 ; i <= 45; i +=5){
            System.out.println(i);
        }









    }
}
