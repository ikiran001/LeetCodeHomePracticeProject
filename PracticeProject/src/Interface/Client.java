package Interface;

import java.util.Scanner;

interface Client {
	void input();
	void output();
}

class Kiran implements Client{

	public static void main(String [] args) {
		Client c=new Kiran();
		c.input(); 
		c.output();
	}


	Scanner sc=new Scanner(System.in);
	String name;
	int salary;
	
	
	@Override
	public void input() {
		System.out.println("Enter your name ");
		name=sc.next();
		System.out.println("Enter your salary ");
		salary=sc.nextInt();
	}

	@Override
	public void output() {
		System.out.println(name +" "+salary);

	}



}

