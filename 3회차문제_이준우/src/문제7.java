import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner scan=new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		while(true) {
			if(scan.hasNextInt()) {
				score=scan.nextInt();
				break;
			}else
				System.out.print("정수로 입력해주세요:");
				scan=new Scanner(System.in);
		}
		if(score>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}

}
