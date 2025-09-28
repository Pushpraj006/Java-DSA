//printing number in decreasing order with the reccursion
public class recursionbasics {

    public static void printing(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printing(n-1);

    }

    public static void main(String[] args) {
        int n = 10;
        printing(n);
    }
}

//printing numbers in increasing order with the recursion

public class recursionbasics{

    public static void increasingorder(int n){
        if(n == 10){
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        increasingorder(n+1);

    }

    public static void main(String[] args) {
        increasingorder(1);
        
    }
}

public class recursionbasics{

    public static void printincreasing(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printincreasing(n-1);
        System.out.print(n + " ");
    }

    public static void main(String args[]){
        printincreasing(5);
    }
}


// printing the factorial of the number with the recursion

public class recursionbasics{
    public static int factorial(int n){
        if( n == 1){
            return 1;
        }

        int facto = n * factorial(n-1);
        return facto;
    }

    public static void main(String args[]){
        System.out.println(factorial(5));
    }
}

//printing the sum of the natural numbers 
public class recursionbasics{
    public static int printing(int n){
        if(n==1){
            return 1;
        }

        int sum = n + printing(n-1);
        return sum;
    }

    public static void main(String args[]){
        System.out.println(printing(2));
    }
}


// fibonacci series using the recursion

public class recursionbasics{

    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }

        int fibo = fibonacci(n-1) + fibonacci(n-2);
        return fibo;
    }
    public static void main(String args[]){
        System.out.println(fibonacci(0));
    }
}

// checking the array is sorted or not with the recursion concept 
public class recursionbasics{
    public static boolean issorted(int arr[], int i){
        //when the i reaches the last element so it means the array is sorted so we return true
        if(i == arr.length-1){
            return true;
        }

        // we checked the first two element if it the condition(not return) is false only then we will proceed ahead
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static void main(String args[]){
        int hello[] = {1,2,3,4,5,6,7,8,90,10};
        System.out.println(issorted(hello,0));
    }
}


//finding the first occurence of the key in the array with the recursion
public class recursionbasics{
    public static int findindex(int arr[], int key, int i){
        if (i==arr.length){
            System.out.println("KEY NOT FOUND");
        }

        if(arr[i] == key){
            return i;
        }
        return findindex(arr, key, i+1);
    }
    public static void main(String args[]){
        int hello[] = {1,2,3,4,5,6,7,8,9,5,10}; 
        System.out.print(findindex(hello, 7, 0));
    }
}

//printing the last occurence of the key
public class recursionbasics{

    public static int printlastoccurence(int arr[], int key, int i){
        if(i < 0 ){
            return -1;
        }

        if(arr[i]== key){
            return i;
        }

        return printlastoccurence(arr, key, i-1);

    }

    public static void main(String args[]){
        int hello[] = {1,2,8,3,4,9};
        int none = hello.length-1;
        System.out.println(printlastoccurence(hello, 6, none));
    }
}


// printing the mathpow(x(base),n(power))
public class recursionbasics{

    public static int mathpow(int x, int n){

        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }

        int ans = x * mathpow(x,n-1);
        return ans;
    }


    public static void main(String args[]){
        System.out.println(mathpow(2, 25));
    }
}



