package practice01;

import java.util.Random;
import java.util.Scanner;
//100라인정도
//힌트 컴퓨터가 숫자를 생각하게 하는것 
public class GuessNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int guessNumber = r.nextInt(100) + 1;
		
		System.out.println(guessNumber);
		
		Scanner scanner = new Scanner( System.in );
		scanner.close();
	}
//do while or while break
}
