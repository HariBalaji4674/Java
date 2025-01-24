package Concepts;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a = 4, b=2;
        System.out.println("Addition of numbers: "+(a+b));
        System.out.println("Subtraction "+ (a-b));
        System.out.println("Multiplication "+(a*b));
        System.out.println("Division (Quotient) "+(a/b));
        System.out.println("Modulo Division (Remainder) "+(a % b));

        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        int x = (3 >= 2) ? 100:200;
        System.out.println(x);
        int age = 19;
        if (age >= 18){
            if (age == 18){
                System.out.println("You are just Crossed 18 Why don't you wait");
            }
            else {
                System.out.println("These people are Eligible for Vote");
            }
        }
        else {
            System.out.println("You are not eligible for vote");
        }
        int number = 20;
        if (number % 2 == 0){
            System.out.println("Number is a Even "+ number);
        }
        else {
            System.out.println("number is odd number");
        }
        number = -10;
        if (number > 0 ){
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The Number is Negative Number");
        }

        number = 30;
        if(number >= 60){
            System.out.println("You got extra ordinary marks");
        } else if (number >=35 && number <=60) {
            System.out.println("You are Just miss you got just pass marks");
        }else {
            System.out.println("Sorry My Bad You Failed the Exam");
        }

        a = 20 ;
        b = 30;
        int c =40 ;
        if (a>b && a >c){
            System.out.println("A is greater number");
        } else if (b>a && b>c) {
            System.out.println("B is greater number");
        }else {
            System.out.println("C is greater number");
        }

        System.out.println("Jumping statements");
        // break and



    }
}
/*
Arithmetic Operators:
----
Addition +
Subtraction -
Multiplication *
Division /   quotient
Modulo % Remainder

Relational / Comparison Operators:
-----
> < >= <= != ==
Returns always Boolean Value

Logical Operators:(Only Boolean Type of Data)
-----
and or not
&&  ||  !
Always returns Boolean Value
We need Only Boolean Variables
Works Between Two Boolean Variables

And Both Should be true
OR Any one Should be true
! Reverse Operators

Assignment Operators:
----
++(Increment) --(Decrement)
Post Increment a++ Assignment after Increment
Pre Increment ++a First Increment then Assignment

Post Decrement a-- Assignment after Decrement
Pre Decrement --a First Decrement then Assignment

res a++ ++a , a-- --a

Assignment Operators:
----
Only for Numbers it will work

a = a+1 Addition
a = a-1 Subtraction
a = a/1 Division
a = a*2 Multiplication
a = a % 2 Modulo Assignment

Ternary Operator: ? :
Variable = expression ? result 1 : result 2

num = (num > 10 )? True : False





















 */