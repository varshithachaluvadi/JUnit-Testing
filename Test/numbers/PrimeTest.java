package numbers;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import org.junit.Test; 
@RunWith(Parameterized.class) 
public class PrimeTest {


private int expected,num;
public PrimeTest(int expectedResult,int n)
{
this.expected=expectedResult; 
this.num=n;
}
@Parameters
public static Collection<Integer[]> primeNumbers(){
return Arrays.asList(new Integer[][]{{0,4},{1,3},{1,5},{0,6},{0,14}});
}

@Test
public void test() {
Prime a=new Prime();
assertEquals(expected,a.checkPrime(num));

}

}
