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