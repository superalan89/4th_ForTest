
public class Practice01 {
	// �Է� 1: ��ũ�� �Ǵ� ���ڿ�
	// �Է� 2: ����� �� ��
	
	
	// bbbbA
	// bbbAA
	// bbAAA
	// bAAAA
	// AAAAA
	
	//    a
	//   aaa
	//  aaaaa
	// aaaaaaa
	//aaaaaaaaa
	
	// run("b", 5)

	
	public void run(String mark, int lines) {
		
		for (int b = 0 ; b < lines ; b = b+1) {
			for (int outIndex = 0; outIndex < b ; outIndex++) {
				System.out.print(mark);
			}		
			System.out.println("" + "A");
		}
			
		for (int i = 0; i < lines; i++) {
		    for (int j = 1; j < lines - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 0; k < i * 2 + 1; k++) {
		        System.out.print(mark);
		    }
		    System.out.println();
		}

		for (int i = lines; i > 0; i--) {
		    for (int j = lines - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    for (int k = i * 2 - 1; k > 0; k--) {
		        System.out.print(mark);
		    }
		    System.out.println();
		}
		
		for (int i = lines; i > 0; i--) {
		    for (int j = lines - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    for (int k = i * 2 - 1; k > 0; k--) {
		        System.out.print(mark);
		    }
		    System.out.println();
		}
		for(int index = 0 ; index < lines ; index=index+1) {
			for (int innerIndex = 0; innerIndex<index+1; innerIndex++) {
				System.out.print(mark);
			}
			System.out.println("");
		}
		
		System.out.println("====================================");
		
		
		for (int i = 0; i < lines; i++) {
		    for (int j = 1; j < lines - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 0; k < i * 2 + 1; k++) {
		        System.out.print(" "+ mark +" ");
		    }
		    System.out.println();
		}

		for (int i = lines; i > 0; i--) {
		    for (int j = lines - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    for (int k = i * 2 - 1; k > 0; k--) {
		        System.out.print(mark);
		    }
		    System.out.println();
		}
		
		for (int i = 0; i < 5; i++)
        {
            for (int j = 4; j > i; j--)
            {
            	System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++)
            {
            	System.out.print(mark);
            }
            System.out.println();
        }
	}		
}