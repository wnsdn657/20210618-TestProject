
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num=0;
		for(int i=100;i<1000;i++) {
			if(i%4!=0) {
				num++;
				sum+=i;
			}
		}
		System.out.println("4의 배수의 갯수:"+num);
		System.out.println("4의 배수 합:"+sum);

	}

}
