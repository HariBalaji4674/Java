package Programs;

public class Slargest {
    public static void main(String[] args) {
        System.out.println("Second Largest Array");
        int arr[] = {12,76,45,35,49,77,04,67};
        int largest = arr[0];
        for (int i = 1;i<arr.length;i++){
//            System.out.println();
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);

        System.out.println("Smallest Element");
        int slargest = -1;
        for (int i = 0;i<=arr.length-1;i++){
            if (arr[i] > slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }
}
