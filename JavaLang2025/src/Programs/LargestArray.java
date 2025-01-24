package Programs;

public class LargestArray {
    public static void main(String[] args) {
        System.out.println("Printing The Largest Element Array");
        int arr[] = {2,9,3,6,11,5};
        System.out.println(arr[1]);
        int largest = arr[0];
        for (int i = 1;i< arr.length;i++){
            System.out.println(arr[i]);
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("The Largest Number is: " +largest);

        System.out.println("  Second Largest Array ");
//        arr = {4,5,7,9,3,2,4};



    }
}
