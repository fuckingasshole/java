import java.util.Scanner;

public class der03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�X�ͤ�:");
		int mon = scn.nextInt();
		System.out.println("�п�J�X�ͤ�:");
		int day = scn.nextInt();
		
		
		if((mon==3 && day>=21 && day<=31) || (mon==4 && day<=19)){
			System.out.println("�d�Ϯy");
		}else if((mon==4 && day>=20 && day<=30) || (mon==5 && day<=20)){
			System.out.println("�����y");
		}else if((mon==5 && day>=21 && day<=31) || (mon==6 && day<=21)){
			System.out.println("���l�y");
		}else if((mon==6 && day>=22 && day<=30) || (mon==7 && day<=22)){
			System.out.println("���ɮy");
		}else if((mon==7 && day>=23 && day<=31) || (mon==8 && day<=22)){
			System.out.println("��l�y");
		}else if((mon==8 && day>=23 && day<=31) || (mon==9 && day<=22)){
			System.out.println("�B�k�y");
		}else if((mon==9 && day>=23 && day<=30) || (mon==10 && day<=23)){
			System.out.println("�ѯ��y");
		}else if((mon==10 && day>=24 && day<=31) || (mon==11 && day<=21)){
			System.out.println("���Ȯy");
		}else if((mon==11 && day>=22 && day<=30) || (mon==12 && day<=20)){
			System.out.println("�g��y");
		}else if((mon==12 && day>=21 && day<=31) || (mon==1 && day<=20)){
			System.out.println("���~�y");
		}else if((mon==1 && day>=21 && day<=31) || (mon==2 && day<=19)){
			System.out.println("���~�y");
		}else if((mon==2 && day>=20 && day<=29) || (mon==3 && day<=20)){
			System.out.println("�����y");
		}else{
			System.out.println("TMD�y");		}
		
	}
}

