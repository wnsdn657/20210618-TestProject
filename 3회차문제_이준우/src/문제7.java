import java.util.Scanner;

public class ����7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		while(true) {
			if(scan.hasNextInt()) {
				score=scan.nextInt();
				break;
			}else
				System.out.print("������ �Է����ּ���:");
				scan=new Scanner(System.in);
		}
		if(score>=60)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
	}

}
