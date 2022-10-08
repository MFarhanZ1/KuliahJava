import java.util.Scanner;

public class TotalBayarNameTag{
	
	public static void main(String[] args){
		
		// inputkan jumlah orang yang memesan
		System.out.print("Berapa Banyak Maba Yang Pesan? ");
		int totalMemesan = new Scanner(System.in).nextInt();
		
		// mendeklarasikan suatu variabel yang berisi nilai harga nametag
		int hargaNametag = 5000;
		
		// melakukan operasi matematika untuk mengetahui total membayar
		int totalMembayar = totalMemesan * hargaNametag;
		
		// mengeluarkan nilai total_membayar sebagai output
		System.out.println("Jadi total bayar nya ialah, Rp." + totalMembayar);

	}	
}






