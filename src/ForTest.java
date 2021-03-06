public class ForTest {
	
	// ControlFlow 활용 및 for문 예제연습
	
	// 입력 1: 마크가 되는 문자열
	// 입력 2: 출력할 줄 수
	// run("A", 5)
	
	public void run(String mark, int lines) {
		
		// 1. 예제 결과값
		// A
		// AA
		// AAA
		// AAAA
		// AAAAA
		
		for(int i = 0 ; i < lines ; i = i+1) { // i = 1, 2, 3, 4, 5
			for (int j = 0; j < i + 1; j++) { // j = 1, 2, 3, 4, 5
				System.out.print(mark);
			}
			System.out.println("");
		}
		
		System.out.println("===================================");
		
		// 2. 예제 결과값
		//     A
		//    AA
		//   AAA
		//  AAAA
		// AAAAA
		
		for (int i = 0; i < lines; i++) // i = 1, 2, 3, 4, 5
        {
            for (int j = lines; j > i; j--) // j = 5, 4, 3, 2, 1
            {
            	System.out.print(" "); // j는 공백을 의미
            }
            for (int k = 0; k < i + 1; k++) // k = 1, 2, 3, 4, 5
            {
            	System.out.print(mark); // k는 'A'를 의미
            }
            System.out.println();
        }
		
		System.out.println("===================================");
		
		// 3. 예제 결과값
		// 피라미드 정방향
		for (int i = 0; i < lines; i++) // i = 1, 2, 3, 4, 5
		{
		    for (int j = 1; j < lines - i; j++) { // j = 4, 3, 2, 1, 0
		        System.out.print(" "); // j는 공백을 의미
		    }
		    for (int k = 0; k < i * 2 + 1; k++) { // k = 1, 3, 5, 7, 9
		        System.out.print(mark); // k는 'A'를 의미
		    }
		    System.out.println();
		}

		System.out.println("===================================");
		
		// 4. 예제 결과값
		// 피라미드 역방향
		
		for (int i = lines; i > 0; i--) { // i = 5, 4, 3, 2, 1
		    for (int j = lines - i; j > 0; j--) { // j = 0, 1, 2, 3, 4
		        System.out.print(" "); //j는 공백을 의미
		    }
		    for (int k = i * 2 - 1; k > 0; k--) { // k = 9, 7, 5, 3, 1
		        System.out.print(mark); // k는 'A'를 의미
		    }
		    System.out.println();
		}
		
		System.out.println("===================================");
		
		// 5. 예제 결과값
		// 다이아몬드
		
		for (int i = 0; i < lines; i++) {
		    for (int j = 1; j < lines - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 0; k < i * 2 + 1; k++) {
		        System.out.print(mark);
		    }
		    System.out.println();
		}
		
		for (int i = lines-1; i > 0; i--) {
		    for (int j = lines - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    for (int k = i * 2 - 1; k > 0; k--) {
		        System.out.print(mark);
		    }
		    System.out.println();
		}
	}
}
