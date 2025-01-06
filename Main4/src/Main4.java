import java.io.*;

class Main4
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("数字を入力してください");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		while(sum <= 100) {
			String str = br.readLine();
			int res = Integer.parseInt(str);
			
			sum = sum + res;
		}
		System.out.println("合計は" + sum + "です");
	}
}