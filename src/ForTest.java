public class ForTest {
	
	// ControlFlow Ȱ�� �� for�� ��������
	
	// �Է� 1: ��ũ�� �Ǵ� ���ڿ�
	// �Է� 2: ����� �� ��
	// run("A", 5)
	
	public void run(String mark, int lines) {
		
		// 1. ���� �����
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
		
		// 2. ���� �����
		//     A
		//    AA
		//   AAA
		//  AAAA
		// AAAAA
		
		for (int i = 0; i < lines; i++) // i = 1, 2, 3, 4, 5
        {
            for (int j = lines; j > i; j--) // j = 5, 4, 3, 2, 1
            {
            	System.out.print(" "); // j�� ������ �ǹ�
            }
            for (int k = 0; k < i + 1; k++) // k = 1, 2, 3, 4, 5
            {
            	System.out.print(mark); // k�� 'A'�� �ǹ�
            }
            System.out.println();
        }
		
		System.out.println("===================================");
		
		// 3. ���� �����
		// �Ƕ�̵� ������
		for (int i = 0; i < lines; i++) // i = 1, 2, 3, 4, 5
		{
		    for (int j = 1; j < lines - i; j++) { // j = 4, 3, 2, 1, 0
		        System.out.print(" "); // j�� ������ �ǹ�
		    }
		    for (int k = 0; k < i * 2 + 1; k++) { // k = 1, 3, 5, 7, 9
		        System.out.print(mark); // k�� 'A'�� �ǹ�
		    }
		    System.out.println();
		}

		System.out.println("===================================");
		
		// 4. ���� �����
		// �Ƕ�̵� ������
		
		for (int i = lines; i > 0; i--) { // i = 5, 4, 3, 2, 1
		    for (int j = lines - i; j > 0; j--) { // j = 0, 1, 2, 3, 4
		        System.out.print(" "); //j�� ������ �ǹ�
		    }
		    for (int k = i * 2 - 1; k > 0; k--) { // k = 9, 7, 5, 3, 1
		        System.out.print(mark); // k�� 'A'�� �ǹ�
		    }
		    System.out.println();
		}
		
		System.out.println("===================================");
		
		// 5. ���� �����
		// ���̾Ƹ��
		
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
