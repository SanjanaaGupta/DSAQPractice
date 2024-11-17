/*import endava.util.Scanner;
class Basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello" +" "+ name);
    }
}*/
/*import endava.util.Scanner;
class Basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if(salary>10000){
            System.out.println(salary+2000);
        }
        else{
            System.out.println(salary+1000);
        }
    }
}*/
//Prime Number
/*import endava.util.Scanner;
class Basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==2){
            System.out.println(num+" is a prime number");
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("not Prime");
                break;
            }
            else{
                System.out.println("Prime");
            }
        }

    }

}*/
//Functions Basic Program
/*import endava.util.Scanner;
class Basics{
    public static void main(String[] args) {
       int result = sum();
       System.out.println(result);
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum =0;
        sum = a+b;
        //return sum;
    }
}*/

// Function String
/*import endava.util.Scanner;
class Basics{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String ans = greet(name);
    }
    static String greet(String name){
       String n = "Hello" +" " + name;
       System.out.println(n);
        return n;
    }

}*/
// Function and String
/*class Basics{
    public static void main(String args[]){
        String name = "endohn";
        //greet(name);
        System.out.println(greet(name));
    }
    static void greet(String naam){
        naam = "Sanendana"; 
        
    }
}*/
 // Function and array

/*import endava.util.Arrays;

/*class Basics{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        change(arr);
       /* for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
        System.out.print(Arrays.toString(arr));
    }
    static void change(int nums[]){
        //nums[0] = 10; // change will affect in original array
         nums = new int[]{5,23,6}; // change doesn't affect to original value
    }
 }*/

 // Shadowing
 /*class Basics{
    static int x = 10;
    public static void main(String args[]){
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
 }*/

 // Var Args
 /*import endava.util.Arrays;
 class Basics{
    public static void main(String args[]){
        fun();
        method1(4,2,"Sanendana", "Gupta");


    }
    static void method1(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(v[0]);
        System.out.println(v[1]);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

 }*/

 //Overloading
 /*class Basics{
    public static void main(String args[]){
        fun(10);
        fun("Sanendaa");

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.println(b);
    }
 }*/
 /*Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
Subarray
A subarray is a contiguous non-empty sequence of elements within an array.

 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.*/
/*class Basics{
    public static void main(String args[]){
            System.out.println("min Length of Subarray is:" +minSubArrays());
    }
    static int minSubArrays(){
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        int minLen = Integer.MAX_VALUE;
        int start =0;
        int sum =0;
            for(int end=0;end<arr.length;end++){
                sum = sum + arr[end];
                while(sum>=target){
                    minLen = Math.min(minLen,end-start+1);
                    sum = sum - arr[start];
                    start++;
                }
            }
            return minLen;
        }

    }*/
