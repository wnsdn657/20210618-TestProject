import java.util.Scanner;
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("10~99 ������ ������ �Է�:");
		String num=scan.next();
		
		if(num.charAt(0)==num.charAt(1))
			System.out.println(num+"��(��) 10�� �ڸ��� 1���ڸ��� �����ϴ�");
		else
			System.out.println(num+"��(��) 10�� �ڸ��� 1�� �ڸ��� �����ʽ��ϴ�.");
	}

}
