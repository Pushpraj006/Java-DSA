public class tilllingproblems{
    public static int countways(int n){
        //tile fitting ways;  2 X N
        if(n==0 || n==1){
            return 1;
        }

        //vertical ways 
        int vertical = countways(n-1);


        //horizontal ways
        int horizontaal = countways(n-2);

        // total ways 
        int total = vertical + horizontal;
        return total;

    }

    public static void main(String args[]){
        System.out.println(countways(5));
    }
}
