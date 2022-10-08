public class MenghitungGajiPokok{
	
	public static void main(String[] args){
		
		// mendeklarasikan suatu variabel yang berisi nilai jumlah hari dalam seminggu
		int hariDalamSeminggu = 7;
		
		// mendeklarasikan variabel yang berisi total absen
		int totalAbsen = 3;
		
		// kalkulasikan operasi matematika untuk tahu berapa hari pekerja tsb masuk dalam seminggu
		int totalMasukKerja = hariDalamSeminggu - totalAbsen;
		
		// mendeklarasikan suatu variabel yang berisi gaji pokok harian
		int gajiPokokHarian = 25000;
		
		// melakukan operasi matematika untuk mengetahui umur user
		int totalGajiPekerjaSeminggu = gajiPokokHarian * totalMasukKerja;
		
		// mengeluarkan nilai umur sebagai output
		System.out.println("Jadi gaji pokok yang diterima pekerja tersebut dalam seminggu ialah sebesar Rp." + totalGajiPekerjaSeminggu);

	}
	
}