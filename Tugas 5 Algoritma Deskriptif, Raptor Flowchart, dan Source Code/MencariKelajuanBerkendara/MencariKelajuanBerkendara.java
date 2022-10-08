public class MencariKelajuanBerkendara{
	
	public static void main(String[] args){
		
		// mendeklarasikan suatu variabel yang berisi jarak yang ditempuh si pembalap
		int jarakLintasan = 8800;

		// mendeklarasikan suatu variabel yang berisi waktu yang ditempuh si pembalap
		int waktuTempuh = 55;		
		
		// lakukan operasi matematika, sesuai rumus v = s/t untuk mencari kecepatan pembalap
		int kecepatanPembalap = jarakLintasan / waktuTempuh;
		
		// tampilkan nilai dari kecepatan pembalap sebagai output
		System.out.format("Jadi Kecepatan Motor si-Pembalap adalah, sebesar %d m/s, yang artinya si-pembalap tersebut dalam tiap detiknya dapat menempuh jarak %d meter!", kecepatanPembalap, kecepatanPembalap);
	
	}
	
}