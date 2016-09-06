package practice01;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class MultipleOfTree {
//입력된 수가 3의 배수인지 판별하는 프로그램
//	"수를 입력하시오 : "
//	"의 배수입니다."
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print("수를 입력하시오 : ");
		
		int input = scanner.nextInt();
		if(input%3 == 0){
			System.out.println(input + "은 3의 배수입니다.");
		}else{
			System.out.println(input + "은 3의 배수가 아닙니다.");
		}
		scanner.close();
	}
}
