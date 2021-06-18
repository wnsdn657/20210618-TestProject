import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1~12사이 숫자를 입력하세요:");
		int num=scan.nextInt();
		while(true) {
			if(num>=1 && num<=12)
				break;
			else
				System.out.println("다시 입력해주세요");
				num=scan.nextInt();
		}
		switch(num) {
		case 3:
		case 4:
		case 5:
			System.out.println(num+"월은 봄입니다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num+"월은 여름입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num+"월은 가을입니다");
			break;
		default :
			System.out.println(num+"월은 겨울입니다");
		}
	}
	

}
