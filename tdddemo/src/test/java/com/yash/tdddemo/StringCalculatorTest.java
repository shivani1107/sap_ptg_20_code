package com.yash.tdddemo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	public static String ANY_SINGLE_NUMBER_AS_STRING_INPUT = "500";
	private StringCalculator stringCalculator;

	@Before
	public void setup() {
		stringCalculator = new StringCalculator();
	}

	@Test
	public void test_Calculate_GivenEmptyString_ShouldReturnZeroAsNumber() {
		int result = stringCalculator.calculate("");
		assertEquals(0, result);
	}

	@Test
	public void test_Calculate_GivenAnySingleNumberAsString_ShouldReturn1AsNumber() {
		int result = stringCalculator.calculate(ANY_SINGLE_NUMBER_AS_STRING_INPUT);
		assertEquals(500, result);
	}

	@Test
	public void test_Calculate_Given100and200SeparatedByComma_ShouldReturn300AsNumber() {
		int result = stringCalculator.calculate("100,200");
		assertEquals(300, result);
	}
}
