package com.yash.tdddemo2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	private MyMath myMath;
	@Before
	public void setup() {
		myMath=new MyMath();
	}

	@Test
	public void test_calulateSum_Given1AsNumber_ShouldReturn0Asnumber() throws NumberSignException {
		int result = myMath.calculateSum(1);
		assertEquals(0, result);
	}
	
	@Test
	public void test_calulateSum_Given2AsNumber_ShouldReturn0Asnumber() throws NumberSignException {
		int result = myMath.calculateSum(2);
		assertEquals(0, result);
	}
	
	@Test
	public void test_calulateSum_Given3AsNumber_ShouldReturn3Asnumber() throws NumberSignException {
		int result = myMath.calculateSum(3);
		assertEquals(0, result);
	}
	
	@Test
	public void test_calulateSum_Given4AsNumber_ShouldReturn3Asnumber() throws NumberSignException {
		int result = myMath.calculateSum(4);
		assertEquals(3, result);
	}
	
	@Test
	public void test_calulateSum_Given5AsNumber_ShouldReturn8Asnumber() throws NumberSignException {
		int result = myMath.calculateSum(5);
		assertEquals(8, result);
	}
	@Test(expected = NumberSignException.class)
	public void test_calulateSum_Given_5AsNumber_ThrowsNumberSignException() throws NumberSignException {
		int result = myMath.calculateSum(-5);
		//assertEquals(8, result);
	}
	@Test
	public void test_calulateSum_Given6AsNumber_ShouldReturn14Asnumber() throws NumberSignException {
		int result = myMath.calculateSum(6);
		assertEquals(14, result);
	}
	@Test
	public void test_calulateSum_Given7AsNumber_ShouldReturn14Asnumber() throws NumberSignException {
		int result = myMath.calculateSum(7);
		assertEquals(14, result);
	}
	@Test
	public void test_calulateSum_Given8AsNumber_ShouldReturn14Asnumber() throws NumberSignException {
		int result = myMath.calculateSum(8);
		assertEquals(14, result);
	}

}
