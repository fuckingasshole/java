import java.util.Scanner;

public class der01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�P��:");
		int w = scn.nextInt();
		switch (w) {
		case 1:
			System.out.print("�P��" + w + "�OMonday");
			break;
		case 2:
			System.out.print("�P��" + w + "�OTuesday");
			break;
		case 3:
			System.out.print("�P��" + w + "�OWednesday");
			break;
		case 4:
			System.out.print("�P��" + w + "�OTursday");
			break;
		case 5:
			System.out.print("�P��" + w + "�OFriday");
			break;
		case 6:
			System.out.print("�P��" + w + "�OSaturday");
			break;
		case 7:
			System.out.print("�P��" + w + "�OSunday");
			break;
		default:
			System.out.println("�z��J���~");
			break;
		}
	}

}
