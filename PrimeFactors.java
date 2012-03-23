import java.util.ArrayList;


public class PrimeFactors {

	public static ArrayList<Integer> getPrimeFactors(int i) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int n = 2; i > 1; n++){
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
		for (int n = 1; n < i; n++){
			if(getPrimeFactors(n).size() == 1) result.add(n);
		}
		return result;
	}

}
