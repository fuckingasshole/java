import java.util.Scanner;

public class der03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入出生月:");
		int mon = scn.nextInt();
		System.out.println("請輸入出生日:");
		int day = scn.nextInt();
		
		
		if((mon==3 && day>=21 && day<=31) || (mon==4 && day<=19)){
			System.out.println("牡羊座");
		}else if((mon==4 && day>=20 && day<=30) || (mon==5 && day<=20)){
			System.out.println("金牛座");
		}else if((mon==5 && day>=21 && day<=31) || (mon==6 && day<=21)){
			System.out.println("雙子座");
		}else if((mon==6 && day>=22 && day<=30) || (mon==7 && day<=22)){
			System.out.println("巨蟹座");
		}else if((mon==7 && day>=23 && day<=31) || (mon==8 && day<=22)){
			System.out.println("獅子座");
		}else if((mon==8 && day>=23 && day<=31) || (mon==9 && day<=22)){
			System.out.println("處女座");
		}else if((mon==9 && day>=23 && day<=30) || (mon==10 && day<=23)){
			System.out.println("天秤座");
		}else if((mon==10 && day>=24 && day<=31) || (mon==11 && day<=21)){
			System.out.println("天蠍座");
		}else if((mon==11 && day>=22 && day<=30) || (mon==12 && day<=20)){
			System.out.println("射手座");
		}else if((mon==12 && day>=21 && day<=31) || (mon==1 && day<=20)){
			System.out.println("摩羯座");
		}else if((mon==1 && day>=21 && day<=31) || (mon==2 && day<=19)){
			System.out.println("水瓶座");
		}else if((mon==2 && day>=20 && day<=29) || (mon==3 && day<=20)){
			System.out.println("雙魚座");
		}else{
			System.out.println("你要不要進來座");		}
		
	}
}

