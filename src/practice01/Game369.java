package practice01;
public class Game369 {
	public static void main(String[] args) {

	int count = 100;
		
	for(int i = 1; i <=count; i++){
		String s = String.valueOf(i);	
		
		if(i <= 10){
		char c1 = s.charAt(0);
			if(c1 == '3' || c1 == '6' || c1 == '9'){
				System.out.println(i + " 짝");
				}
			}
		
		if(i > 10 && i <= count){
			char c2 = s.charAt(0);
			char c3 = s.charAt(1);
			if(c2 == '3' || c2 =='6' || c2 =='9'){
				System.out.print(i + " 짝");

				if(c3 == '3' || c3 == '6' || c3 == '9'){
				System.out.print("짝");
			}
				System.out.println();
			}

		}
			
		
		}
		
	}
		
}

	