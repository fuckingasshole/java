import java.util.Scanner;

public class der02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�P��");
		int w = scn.nextInt();
		String str = "";
				if (w < 1 || w > 7) {
			System.out.println("��J���~");
		} else {
			switch (w) {
			case 1:
				str = "Monday";
				break;
			case 2:
				str = "Tuesday";
				break;
			case 3:
				str = "Wednesday";
				break;
			case 4:
				str = "Tursday";
				break;
			case 5:
				str = "Friday";
				break;
			case 6:
				str = "Saturday";
				break;
			case 7:
				str = "Sunday";
				break;

			}
			System.out.println("�P��" + w + "�O" + str);

		}

	}

}
