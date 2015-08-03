import java.util.Scanner;
public class class02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入攝氏溫度:");
		float c=scn.nextFloat();
		float f=c*9/5+32;
		System.out.println("華氏溫度為"+f);
	}

}
