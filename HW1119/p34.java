package HW3_20201119;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class p34 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("�п�J�@�Ӿ��");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println("�z��J���Ʀr�O:"+num);
	}
}
