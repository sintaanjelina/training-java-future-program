public class bulan{
	public static void main(String[] args){
		if(args.length!=1){
			System.err.println("Usage: bulan <nomorbulan>");
			return;
		}
		int month = Integer.parseInt(args[0]);
		switch(month){
			case 1:
				System.out.println("Januari");
				break;
			case 2 :
				System.out.println("Febuari");
				break;
			case 3 :
				System.out.println("Maret");
				break;
			case 4 :
				System.out.println("April");
				break;
			case 5 :
				System.out.println("Mei");
				break;
			case 6 :
				System.out.println("Juni");
				break;
			case 7 :
				System.out.println("Juli");
				break;
			case 8 :
				System.out.println("Agustus");
				break;
			case 9 :
				System.out.println("September");
				break;
			case 10 :
				System.out.println("Oktober");
				break;
			case 11 :
				System.out.println("November");
				break;
			case 12:
				System.out.println("Desember");
				break;	
			default :
				System.out.println(
				"bukan bulan");
		}
	}	
}