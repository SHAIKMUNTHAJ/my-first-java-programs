package com.javapackage;

import java.math.BigInteger;

public class Datatypes {
	BigInteger i1 = new BigInteger("100");
BigInteger  i2 = new BigInteger("120");

	public static void main(String[] args) {
		Datatypes dt = new Datatypes();
		System.out.println(dt.i1.add(dt.i2));
		
		System.out.println(dt.i1.multiply(dt.i2));
		System.out.println(dt.i1.divide(dt.i2));
		System.out.println(dt.i1.gcd(dt.i2));
		System.out.println(dt.i1.min(dt.i2));
		System.out.println(dt.i1.max(dt.i2));
		System.out.println(dt.i1.mod(dt.i2));
		System.out.println(dt.i1.modInverse(dt.i2));
		//System.out.println(dt.i2.modPow(dt.i2, i1));
		//System.out.println(dt.i1.pow(dt.i2));
		System.out.println(dt.i1.remainder(dt.i2));
		System.out.println(dt.i1.subtract(dt.i2));
		//System.out.println(dt.i1.shiftRight(dt.i2));
		
	}

}
