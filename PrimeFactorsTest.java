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
	
	@Test
	public void test4(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		result.add(2);
		assertEquals(result, PrimeFactors.getPrimeFactors(4));
	}
	
	@Test
	public void test6(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		result.add(3);
		assertEquals(result, PrimeFactors.getPrimeFactors(6));
	}
	
	@Test
	public void test8(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(2);
		result.add(2);
		result.add(2);
		assertEquals(result, PrimeFactors.getPrimeFactors(8));
	}
	
	@Test
	public void test9(){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(3);
		result.add(3);
		assertEquals(result, PrimeFactors.getPrimeFactors(9));
	}
}
