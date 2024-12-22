import java.io.*;

public class Main3 
{
	public static void main(String[] args) throws IOException
	{	
		System.out.println("あなたの試験の点数は？");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int score = Integer.parseInt(str);
		
		if(score < 0 || 100 < score ) {
			System.out.println("0~100で入力してください");
			return;
		}
		
		if(60 > score) {
			System.out.println("不合格");
			System.out.println("ざんねんでした。");
			System.out.println("不可");
		}
		else if(70 > score) {
			System.out.println("合格");
			System.out.println("よくできました。");
			System.out.println("可");
		}
		else if(80 > score) {
			System.out.println("合格");
			System.out.println("よくできました。");
			System.out.println("良");
		}
		else {
			System.out.println("合格");
			System.out.println("たいへんよくできました。");
			System.out.println("優");
		}
	}
}