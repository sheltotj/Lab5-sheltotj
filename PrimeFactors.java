import java.util.ArrayList;


public class PrimeFactors {

	public static ArrayList<Integer> getPrimeFactors(int i) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int max = i/2 + 1;
		for(int n = 2; n < max; n++){
			while(i%n == 0){
				result.add(n);
				i/=n;
			}
		}
		
		if((i == 2) || (i == 3)) result.add(i);
		return result;
	}

	public static ArrayList<Integer> getSmallerPrimes(int i) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(i > 2) result.add(2);
		if(i > 3) result.add(3);
		if(i > 5) result.add(5);
		if(i > 7) result.add(7);
		if(i > 11) result.add(7);
		return result;
	}

}
