import java.util.Scanner;

public class der01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入星期:");
		int w = scn.nextInt();
		switch (w) {
		case 1:
			System.out.print("星期" + w + "是Monday");
			break;
		case 2:
			System.out.print("星期" + w + "是Tuesday");
			break;
		case 3:
			System.out.print("星期" + w + "是Wednesday");
			break;
		case 4:
			System.out.print("星期" + w + "是Tursday");
			break;
		case 5:
			System.out.print("星期" + w + "是Friday");
			break;
		case 6:
			System.out.print("星期" + w + "是Saturday");
			break;
		case 7:
			System.out.print("星期" + w + "是Sunday");
			break;
		default:
			System.out.println("您輸入錯誤");
			break;
		}
	}

}
