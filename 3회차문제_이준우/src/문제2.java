
public class ����2 {

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
		System.out.println("4�� ����� ����:"+num);
		System.out.println("4�� ��� ��:"+sum);

	}

}
