/*import startava.util.Scanner;
class Basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello" +" "+ name);
    }
}*/
/*import startava.util.Scanner;
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
/*import startava.util.Scanner;
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
/*import startava.util.Scanner;
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
/*import startava.util.Scanner;
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
        String name = "startohn";
        //greet(name);
        System.out.println(greet(name));
    }
    static void greet(String naam){
        naam = "Sanstartana"; 
        
    }
}*/
 // Function and array

/*import startava.util.Arrays;

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
 /*import startava.util.Arrays;
 class Basics{
    public static void main(String args[]){
        fun();
        method1(4,2,"Sanstartana", "Gupta");


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
        fun("Sanstartaa");

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
            for(int start=0;start<arr.length;start++){
                sum = sum + arr[start];
                while(sum>=target){
                    minLen = Math.min(minLen,start-start+1);
                    sum = sum - arr[start];
                    start++;
                }
            }
            return minLen;
        }

    }*/
    //Longest Sub-Array with Sum K
    /*class Basics{
        public static void main(String[] args) {
            System.out.println("Longest Subarray Length is:" + longSubArray());
        }
        static int longSubArray(){
            int[] nums = {10, 5, 2, 7, 1, 9};
            int sum = 0;
            int target = 15;
            int maxLen = Integer.MIN_VALUE;
            int start = 0;
            for(int start = 0;start<nums.length;start++){
                sum = sum + nums[start];
                while(sum>=target){
                    maxLen = Math.max(maxLen,start-start+1);
                    sum = sum - nums[start];
                    start++;
                }
            }
            return maxLen;

        }
    }*/
//560. Subarray Sum Equals K
/*class Basics{
    public static void main(String[] args) {
        System.out.println("Count is:" + subarraySum());
    }
    static int subarraySum(){
        int k = 2;
        int[] nums = {1,1,1};
        int sum =0;
        int count =0;
        for(int start=0;start<nums.length;start++){
            sum = 0;
            for(int end = start;end<nums.length;end++){
                sum = sum +nums[end];
                if(sum==k){
                    count++;
                }
                }
            }
        return count;
    }
}*/

//https://leetcode.com/problems/product-of-array-except-self/
//238. Product of Array Except Self
/*class Basics{
    public static void main(String[] args) {
       System.out.println(productArray());
    }
    static int[] productArray(){
        int[] nums = {1,2,3,4};
        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            output[i]=nums[j]*output[i];
        }
    }
    for(int i=0;i<output.length;i++){
        System.out.println(output[i]);
    }
    return output;
    }
}*/

// 238. Product of Array Except Self(Method 2)
/*class Basics{
    public static void main(String[] args) {
        prodArray();
    }
    static int[] prodArray(){
        int[] nums = {-1,1,0,-3,3};
        int prod = 1;
        int[] arr = new int[nums.length];
       for(int i=0;i<nums.length;i++){
        prod =1;
        for(int j=0;j<nums.length;j++){
            if(i==j){
                continue;
            }
            prod = prod * nums[j];
        }
        arr[i] = prod;
       }
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
       }
       return arr;
    }
}*/
//121. Best Time to Buy and Sell Stock
/*class Basics{
    public static void main(String[] args) {
        System.out.println(stock());
    }
    static int stock(){
        int[] prices = {7,1,5,3,6,4};
        int minBuy = prices[0];
        int maxProfit =0;
      //  int result=0;
        for(int i=0;i<prices.length;i++){
            minBuy = Math.min(minBuy,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-minBuy);
            //result = maxProfit - minBuy;
        }
        return maxProfit;
    }
}*/
//53. Maximum Subarray
/*class Basics{
    public static void main(String[] args) {
        System.out.println(largestSum());
    }
    static int largestSum(){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            arr[i] = sum;
        }
        for(int i=0;i<arr.length;i++){
            maxSum = Math.max(maxSum,arr[i]);

        }
        return maxSum;
    }
}*/

//Calculator
/*import java.util.Scanner;
class Basic{
    public static void main(String[] args) {
       calculator();
    }
    static void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second numebr:");
        int num2 = sc.nextInt();
        sc.nextLine();
       // int sum,product,div,rem,subtraction;
        System.out.println("Enter the operation you want to perform:");
        char oper = sc.next().charAt(0);
        switch (oper) {
            case '+':
                System.out.println("Addition:" + (num1+num2));
                break;
            case '-':
                System.out.println("Subtraction:" + (num1-num2));
                break;
            case '*':
                System.out.println("Multiplication is:" + (num1*num2));
                break;    
            case '%':
                System.out.println("Remainder is:" + (num1%num2));    
                break;
            case '/':
                 if(num2!=0){
                    System.out.println("Division is:" + (num1/num2));
                 }
            default:
            System.out.println("Invalid Operation");
            
        }
        sc.close();

    }
}*/

// linear Search
/*import java.util.Scanner;
class Basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Enter Array element:");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The target Element:");
        int target = sc.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int elem = arr[i];
            if(elem==target){
               index =i;
               break;
            }
        }
        if(index != -1){
            System.out.println("Element is found at index:" + index);
        }
            else{
                System.out.println("Element not found");
            }
        }
    }*/
    //

    // Linear search using boolean
    /*class Basics{
        public static void main(String[] args) {
            System.out.println(linear());
        }
        static boolean linear(){
        int[] arr = {5 , 3 ,2 ,6};
            int target = 6;
            boolean flag = false;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    return true;
                }
            }
            return false;
    }
}*/
// Linear Search using string
/*class Basics{
    public static void main(String args[]){
       search();
    }
    static void search(){
        String str = "Sanjana";
        char target = 'a';
        int index =-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("char fount at index:"+index);
        }
        else{
            System.out.println("char not found");
        }
        return;
    }
}*/
//Linear Search using Range
class Basics{
    public static void main(String[] args) {
        search();
    }
    static void search(){
        int[] arr = {5, 3, 2, 6};
        int target = 6;
        int index = -1;
        int start = 1;
        int end = 3;
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }

}
