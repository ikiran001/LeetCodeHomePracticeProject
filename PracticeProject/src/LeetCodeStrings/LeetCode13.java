package LeetCodeStrings;
//13. Roman to Integer
//https://leetcode.com/problems/roman-to-integer/
public class LeetCode13 {

	public static void main(String[] args) {
		String s="MCMXCIV";
		System.out.println(romanToInt(s));
	}
	static int romanToInt(String s) {
		int sum=0;
		int length=s.length();
		for (int i = 0; i < length; i++) {
			if(s.charAt(i)=='I') {
				if(i<length-1&&s.charAt(i+1)=='V') {
					sum+=4;
					i+=1;
				}
				else if(i<length-1&&s.charAt(i+1)=='X') {
					sum+=9;
					i+=1;
				}
				else sum+=1;
			}
			else if(s.charAt(i)=='V') {
				sum+=5;
			}
			else if(s.charAt(i)=='X') {
				if(i<length-1&&s.charAt(i+1)=='L') {
					sum+=40;
					i+=1;
				}
				else if(i<length-1&&s.charAt(i+1)=='C') {
					sum+=90;
					i+=1;
				}
				else sum+=10;
			}
			else if(s.charAt(i)=='L') {
				sum+=50;
			}
			else if(s.charAt(i)=='C') {
				if(i<length-1&&s.charAt(i+1)=='D') {
					sum+=400;
					i+=1;
				}
				else if(i<length-1&&s.charAt(i+1)=='M') {
					sum+=900;
					i+=1;
				}
				else sum+=100;
			}
			else if(s.charAt(i)=='D') {
				sum+=500;
			}
			else {
				sum+=1000;
			}

		}
		return sum;
	}
}
