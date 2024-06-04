public class VowelInString {

	public static void main(String[] args) {
		String s ="abciiidef";
		int k =3;
		int sum =0;

		for (int i =0; i<k; i++ ) {
			if (s.charAt(i) == "a" || s.charAt(i) == "e" || s.charAt(i) == "i" || s.charAt(i) == "o" || s.charAt(i) == "u") {
				sum += 1;
			}
		}
		for(int i = k; i< s.length; i++){
			if (s.charAt(i) == "a" || s.charAt(i) == "e" || s.charAt(i) == "i" || s.charAt(i) == "o" || s.charAt(i) == "u") {
				sum += 1;
			}
				if (s.charAt(i-k) == "a" || s.charAt(i-k) == "e" || s.charAt(i-k) == "i" || s.charAt(i-k) == "o" || s.charAt(i-k) == "u") {
				sum -= 1;
			}
		}
		System.out.println("sum = "+sum);
	}
}