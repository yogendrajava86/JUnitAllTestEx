package com.app.dev;

public class Mathmatics {
	public static boolean isArmStrong(int num) {
		int temp=num,c;
		int armNum=0;
		int len=Integer.toString(num).length();
		while(num>0) {
			c=num%10;
			armNum=armNum+(int)Math.pow(c, len);
			num=num/10;
		}
		return temp==armNum;
	}
}
