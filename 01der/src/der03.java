import java.util.Scanner;

public class der03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ğ¿é¤J¥X¥Í¤ë:");
		int mon = scn.nextInt();
		System.out.println("½Ğ¿é¤J¥X¥Í¤é:");
		int day = scn.nextInt();
		
		
		if((mon==3 && day>=21 && day<=31) || (mon==4 && day<=19)){
			System.out.println("¨d¦Ï®y");
		}else if((mon==4 && day>=20 && day<=30) || (mon==5 && day<=20)){
			System.out.println("ª÷¤û®y");
		}else if((mon==5 && day>=21 && day<=31) || (mon==6 && day<=21)){
			System.out.println("Âù¤l®y");
		}else if((mon==6 && day>=22 && day<=30) || (mon==7 && day<=22)){
			System.out.println("¥¨ÃÉ®y");
		}else if((mon==7 && day>=23 && day<=31) || (mon==8 && day<=22)){
			System.out.println("·à¤l®y");
		}else if((mon==8 && day>=23 && day<=31) || (mon==9 && day<=22)){
			System.out.println("³B¤k®y");
		}else if((mon==9 && day>=23 && day<=30) || (mon==10 && day<=23)){
			System.out.println("¤Ñ¯¯®y");
		}else if((mon==10 && day>=24 && day<=31) || (mon==11 && day<=21)){
			System.out.println("¤ÑÃÈ®y");
		}else if((mon==11 && day>=22 && day<=30) || (mon==12 && day<=20)){
			System.out.println("®g¤â®y");
		}else if((mon==12 && day>=21 && day<=31) || (mon==1 && day<=20)){
			System.out.println("¼¯½~®y");
		}else if((mon==1 && day>=21 && day<=31) || (mon==2 && day<=19)){
			System.out.println("¤ô²~®y");
		}else if((mon==2 && day>=20 && day<=29) || (mon==3 && day<=20)){
			System.out.println("Âù³½®y");
		}else{
			System.out.println("TMD®y");		}
		
	}
}

