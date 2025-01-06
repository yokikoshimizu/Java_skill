import java.io.*;
import java.util.*;

class Main5{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		List<Integer> ages = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("年齢を入力してください");
			String str = br.readLine();
			int age = Integer.parseInt(str);
			ages.add(age);
		}
		
		List<Integer> above20 = new ArrayList<>();
		for(int age : ages) {
			if(age >= 20) {
				above20.add(age);
			}
		}
		
		if(above20.isEmpty()) {
			System.out.println("20才以上は存在しません");
		}
		else{
			for(int age : above20) {
				System.out.println(age + "才");
			}
		}
	}
}