import java.util.*;
import java.lang.*;
import java.io.*;

class PotatoHunter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int r, c, p;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		r = Integer.parseInt(reader.readLine());
		c = Integer.parseInt(reader.readLine());
		
		char[][] farm = new char[r][c];
		for (int i = 0; i < r; i++) {
			farm[i] = reader.readLine().toCharArray();
		}
		
		p = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < p; i++) {
			String[] line = reader.readLine().split(" ");
			int x = Integer.parseInt(line[0]);
			int y = Integer.parseInt(line[1]);
			
			Integer result = 0;
			// print result
			System.out.println(result.toString());
		}
	
	}
	
	public static void countPotatoes() {
		
	}
}
