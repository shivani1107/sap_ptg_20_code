package com.yash.tdddemo;

import java.util.Arrays;

public class StringCalculator {
public int calculate(String input) {
		
		if (input.isEmpty()) {
			return 0;
		}
		else {
			return Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).sum();
		}
	}
}


