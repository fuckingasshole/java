import java.util.Scanner;
public class der01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("���� �魫");
		float high = scn.nextFloat();
		float weight = scn.nextFloat();
		if(high>165 && weight<45){
			System.out.println("�i�橹");
		}else{
			System.out.println("���i�橹");
		}
	
	}

}
