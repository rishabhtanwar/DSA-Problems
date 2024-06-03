public class ReverseString {

    public static void main(String[] args){
    char[] s = new char[]{'h','e','l','l','o'};
       int i = 0;
       int j= s.length -1;
while(i<j){
    Character temp = s[i];
    s[i] = s[j];
    s[j] = temp;
    i++;
    j--;
    }
    for(int k =0; k < (s.length); k++){
        System.out.println(""+s[k]);
    }
}
}