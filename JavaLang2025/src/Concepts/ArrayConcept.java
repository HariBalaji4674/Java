package Concepts;

public class ArrayConcept {
    public static void main(String[] args) {
        System.out.println("Arrays Concepts Class");
        // Declaring an array
//        int arr[] = new int[5];
        int a[] = {125,225,345,456,789,987};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Skipping ..... and Printing Enhanched For Loop ");

        for (int x : a){
            System.out.println(x);
        }
        System.out.println("Multidimensional Array");
//        int a1[][] = new int[3][2];
        int a1[][] = {{100,200},{200,300},{400,500}};
        System.out.println(a1.length);
        System.out.println(a1[0].length);




    }
}
