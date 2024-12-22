import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException 
    {
    	int x = 3;
    	int y = 5;
    	
    	System.out.println("入れ替え前: x = " + x + "y = " + y);
    	
    	int temp = x;
    	x = y;
    	y = temp;
    	
    	//xの値をtempに一時保存⇒yにtemp(=x)を後で代入する手順
    	
    	System.out.println("入れ替え後: x = " + y + "y = " + x);
    }
}
