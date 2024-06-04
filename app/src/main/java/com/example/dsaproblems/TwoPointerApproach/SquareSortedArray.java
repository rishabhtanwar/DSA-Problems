public class SquareSortedArray{

	 public static void main(String[] args){
   int[] arr = new int[]{-4,-1,0,3,10};
   int[] ansArr = new int[arr.length];
   for(int i =0; i< arr.length; i++){
   ansArr[i] = Math.abs((arr[i]*arr[i]));
   }
   for(int i =0; i< ansArr.length; i++){

   for(int j=i+1; j<ansArr.length; j++){
   if(ansArr[j]<ansArr[i]){
   int temp = ansArr[j];
   ansArr[j] = ansArr[i];
   ansArr[i] = temp;
   }
   }
   }
   for(int j=0; j<ansArr.length; j++){
   System.out.println(""+ansArr[j]);
   }
   }
}