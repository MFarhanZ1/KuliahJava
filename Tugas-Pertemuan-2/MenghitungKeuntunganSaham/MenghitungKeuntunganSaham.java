public class MenghitungKeuntunganSaham{
	
	public static void main(String[] args){
		
		// mendeklarasikan suatu variabel yang berisi jumlah pembelian saham awal si trader
		int jumlahLembarPembelianAwal = 500;

		// mendeklarasikan suatu variabel yang berisi harga saham awal yang dibeli
		int hargaSahamAwal = 20;		

		// mendeklarasikan suatu variabel yang berisi harga saham awal yang dibeli
		int hargaSahamTerbaru = 25;	
		
		// lakukan operasi matematika, untuk mencari total pembelian awal saham
		int totalPembelianAwal = jumlahLembarPembelianAwal * hargaSahamAwal;

		// lakukan operasi matematika, untuk mencari total pembelian saham terbaru
		int totalPembelianTerbaru = jumlahLembarPembelianAwal * hargaSahamTerbaru;
		
		// lakukan operasi matematika, untuk mencari tahu kerugian trader
		int keuntunganTrader = totalPembelianTerbaru - totalPembelianAwal;

		// tampilkan nilai dari keuntungan_trader sebagai output
		System.out.format("Jadi Trader Tersebut Mendapatkan Keuntungan Sebesar $" + keuntunganTrader + "!");
	}
}