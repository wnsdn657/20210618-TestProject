import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("10~99 사이의 정수를 입력:");
		String num=scan.next();
		
		if(num.charAt(0)==num.charAt(1))
			System.out.println(num+"은(는) 10의 자리와 1의자리가 같습니다");
		else
			System.out.println(num+"은(는) 10의 자리와 1의 자리가 같지않습니다.");
	}

}
