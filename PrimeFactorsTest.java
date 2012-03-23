import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class PrimeFactorsTest {
	
	@Test
	public void testPrimeFactors1(){
		assertEquals(new ArrayList<Integer>(), PrimeFactors.getPrimeFactors(1));
	}
	
	@Test
	public void testPrimeFactors2(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		assertEquals(result, PrimeFactors.getPrimeFactors(2));
	}
	
	@Test
	public void testPrimeFactors3(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(3);
		assertEquals(result, PrimeFactors.getPrimeFactors(3));
	}
	
	@Test
	public void testPrimeFactors4(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		result.add(2);
		assertEquals(result, PrimeFactors.getPrimeFactors(4));
	}
	
	@Test
	public void testPrimeFactors6(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		result.add(3);
		assertEquals(result, PrimeFactors.getPrimeFactors(6));
	}
	
	@Test
	public void testPrimeFactors8(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		result.add(2);
		result.add(2);
		assertEquals(result, PrimeFactors.getPrimeFactors(8));
	}
	
	@Test
	public void testPrimeFactors9(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(3);
		result.add(3);
		assertEquals(result, PrimeFactors.getPrimeFactors(9));
	}
	
	@Test
	public void testPrimeFactors325115(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(5);
		result.add(7);
		result.add(7);
		result.add(1327);
		assertEquals(result, PrimeFactors.getPrimeFactors(325115));
	}
	
	@Test
	public void testSmallerPrimes2(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		assertEquals(result, PrimeFactors.getSmallerPrimes(2));
	}
	
	@Test
	public void testSmallerPrimes3(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		assertEquals(result, PrimeFactors.getSmallerPrimes(3));
	}
	
	@Test
	public void testSmallerPrimes4(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		result.add(3);
		assertEquals(result, PrimeFactors.getSmallerPrimes(4));
	}
}
