import java.util.Arrays;

public class ����9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
			sum+=arr[i];
		}
		System.out.println("���� ������:"+Arrays.toString(arr));
		System.out.printf("%.2f",(sum/10.0));
	}

}
