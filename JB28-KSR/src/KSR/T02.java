package KSR;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class T02 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src\\KSR\\data.txt"));
		String str;
		int sum=0;
		while(sc.hasNextLine()) {
		str = sc.nextLine();
//		System.out.println(str);
		Scanner rowsc=new Scanner(str);
		sum=0;
			while (rowsc.hasNextInt()) {
				int temp;
				temp=rowsc.nextInt();
//				System.out.println(temp);
				sum=temp+sum;
//				System.out.println(sum);
			}
			System.out.println("_ _ _ _ _ _ _ _ _ _");
			System.out.println("|"+sum+"|");
		}
		System.out.println("_ _ _ _ _ _ _ _ _ _");
		}
}
