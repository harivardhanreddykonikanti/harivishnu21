package SamplePrograms;

import java.util.Random;

public class randomNumberProgram {
	public static void main(String[] args) {
		Random random=new Random();
		int number = random.nextInt(1500);
		System.out.println(number);
	}

}
