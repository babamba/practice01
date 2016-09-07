package practice01;


public class Prob2 {

	public static void main(String[] args) {
	System.out.println("실행결과" + "\n" + "ㅡㅡㅡㅡ");

	for(int j = 1; j <= 8; j++){			//1. 몸체 혹은 세로라인 4.안의 반복문 탈출 후 ++만큼 반복
		for(int i = j; i <= j+9; i++ ){		//2. 몸체를 바탕으로 +9를 하여 그 만큼 반복
			System.out.print(i + " ");		//3. 몸체 +9된 만큼 출력 후 조건만족하면 탈출 5. 외부 반복문 반복만큼 반복
				}
				System.out.println();		// ln으로 한줄한줄씩
			}
			
	  	}
	}