package LeetCodeArrays;
//2469. Convert the Temperature
//https://leetcode.com/problems/convert-the-temperature/
public class LeetCode2469 {

	public static void main(String[] args) {


	}

	public double[] convertTemperature(double celsius) {
		double [] arr=new double[2];
		double kelvin=celsius+273.15;
		double far=celsius * 1.80 + 32.00;
		arr[0]=kelvin;
		arr[1]=far;
		return arr;
	}
}