import java.util.Scanner;
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1~12���� ���ڸ� �Է��ϼ���:");
		int num=scan.nextInt();
		while(true) {
			if(num>=1 && num<=12)
				break;
			else
				System.out.println("�ٽ� �Է����ּ���");
				num=scan.nextInt();
		}
		switch(num) {
		case 3:
		case 4:
		case 5:
			System.out.println(num+"���� ���Դϴ�");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num+"���� �����Դϴ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num+"���� �����Դϴ�");
			break;
		default :
			System.out.println(num+"���� �ܿ��Դϴ�");
		}
	}
	

}
