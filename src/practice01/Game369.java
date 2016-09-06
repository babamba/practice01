package practice01;
public class Game369 {
	public static void main(String[] args) {
		
		int number = 36942;	//문자열로 보고 푸는것 추천
		String s = String.valueOf(number); //number를 문자열로 변환
		
		System.out.println(s.length());
		char c = s.charAt(2); //0부터 시작해서 2번째 문자를 빼내라
		System.out.println(c);
		
		int ClapCount = 0;
		if(c == '3' || c == '6' || c == '9'){
			ClapCount++;
		}
	}
}
