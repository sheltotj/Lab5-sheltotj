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

}
