public class CombineArray {

    public static void main(String[] args){
        int[] arr1 = new int[]{1, 4,7,20};
        int[] arr2 = new int[]{3,5,6};
        int i =0;
        int j =0;
        List<Integer> ansArray = new ArrayList<>();
                while(i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]) {
                ansArray.add(arr1[i]);
                i++;
            }else{
                ansArray.add(arr2[j]);
                j++;
            }
        }
        while(i<arr1.length){
            ansArray.add(arr1[i]);
            i++;
        }
         while(j<arr2.length){
            ansArray.add(arr2[j]);
            j++;
        }
        for (int k=0; k<ansArray.size(); k++) {
            System.out.print(" "+ansArray.get(k));
        }
    }
}