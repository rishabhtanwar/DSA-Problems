public class StringSubsequence {

    public static void main(String[] args){
      String s = "ace";
       String t ="abcde";
       int i =0;
       int j =0;
       while(i < s.length() && j < t.length()){
        if (s.charAt(i)==(t.charAt(j))) {
          i++;  
        }else{
            j++;
        }
       }
       
       if (i==s.length()) {
           System.out.println("s is Subsequence of t");
       }else{
                  System.out.println("s is not Subsequence of t");
       }
    }
}