public class hello{

    public static String removedupli(String hello){

        // took a new string in which we will add the unduplicated letters
        String bye = "";
        for(int i = 0; i<hello.length(); i++){
        
// When the first 'l' or 'o' occurs in "hellooye", won't this condition fail since that character appears again later?   
//Answer: No, the condition will still succeed for the first occurrence, because indexOf() checks only if the character is already in the result string — it does not care about future characters.
        
          
          if(bye.indexOf(hello.charAt(i)) == -1){
                bye += hello.charAt(i);
            }
        }
        return bye;
    }

    public static void main(String[] args) {
    System.out.println(removedupli("hellooye"));
    }
}
