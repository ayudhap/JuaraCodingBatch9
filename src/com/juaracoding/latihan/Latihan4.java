package com.juaracoding.latihan;

import java.util.Arrays;
import java.util.Collections;

public class Latihan4 {
	
	Integer x[] = {3,4,6,7,2};
	
	public void myArray() {
		Arrays.sort(x, Collections.reverseOrder());
		System.out.println(Arrays.toString(x));
	}
	
	public static void main(String[] args) {
		Latihan4 main = new Latihan4();
		main.myArray();
	}

}
