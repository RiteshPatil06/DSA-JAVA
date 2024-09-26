public class Recurssion1 {

    //print 5 to 1
    // public  static void printNumb(int n) {
    //     if(n == 0) { //base case
    //         return;
    //     }
    //     System.out.println(n);//print the number
    //     printNumb(n-1);//recurssion
    // }
    // public static void main(String[] args) {
    //     // int n = 5;
    //     // printNumb(n);//call the function
    // }

//////////////////////////////////////////////
    //print 1 to 5
    // public  static void printNumb(int n) {
    //     if(n == 0) { //base case
    //         return;
    //     }
    //     printNumb(n-1);//recurssion
    //     System.out.println(n);//print the number
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     printNumb(n);//call the function
    // }

//////////////////////////////////////////////
    //sum of n numbers
    // public static void printSum(int i, int n, int sum) {
    //     if(i == n) { //base case
    //         sum += i;//add the last number
    //         System.out.println(sum);//print the sum
    //         return;
    //     }
    //     sum += i;//add the number
    //     printSum(i+1, n, sum);//recurssion

    // }

    // public static void main(String[] args) {
    //     printSum(1, 50, 0);//call the function
    // }

//////////////////////////////////////////////
    //factorial of a number
    // public static void printFactorial(int n, int fact) {
    //     if(n == 0) { //base case
    //         System.out.println(fact);//print the factorial
    //         return;
    //     }
    //     fact *= n;//multiply the number
    //     printFactorial(n-1, fact);//recurssion
    // }

    // public static void main(String[] args) {
    //     printFactorial(5, 1);//call the function
    // }

//////////////////////////////////////////////
    //fibonacci series till n term
    // public static void printFibonacci(int n, int a, int b) {
    //     if(n == 0) { //base case
    //         return;
    //     }
    //     int c = a+b;//add the two numbers
    //     System.out.println(c);//print the number
    //     printFibonacci(n-1, b, c);//recurssion

    // }

    // public static void main(String[] args) {
    //     int a=0, b=1;
    //     System.out.println(a);//print the first number
    //     System.out.println(b);//print the second number
    //     int n = 7;
    //     printFibonacci(n-2, a, b);//call the function
    // }

//////////////////////////////////////////////
    //power of a number
    public static void printPower(int n, int p, int pow) {
        if(p == 0) { //base case
            System.out.println(pow);//print the power
            return;
        }
        pow *= n;//multiply the number
        printPower(n, p-1, pow);//recurssion
    }

    public static void main(String[] args) {
        printPower(2, 5, 1);//call the function
    }

}
