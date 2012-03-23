import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class PrimeFactorsTest {
	
	@Test
	public void test1(){
		assertEquals(new ArrayList<Integer>(), PrimeFactors.getPrimeFactors(1));
	}
	
	@Test
	public void test2(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		assertEquals(result, PrimeFactors.getPrimeFactors(2));
	}
	
	@Test
	public void test3(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(3);
		assertEquals(result, PrimeFactors.getPrimeFactors(3));
	}
}
