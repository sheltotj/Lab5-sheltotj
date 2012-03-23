import java.util.ArrayList;


public class PrimeFactors {

	public static ArrayList<Integer> getPrimeFactors(int i) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(i%2 == 0){
			result.add(2);
			i/=2;
		}
		if((i == 2) || (i == 3)) result.add(i);
		return result;
	}

}
