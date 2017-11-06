import java.util.Scanner;

class Laporan {
	public String no_lap;
	public String tgl_lap;
	public String jenis_lap;
Scanner Input = new Scanner (Scanner.in) ;
	public void cetak() {
		this.no_lap = " 123qw";
		this.tgl_lap = " 17 Oktober 2017";
		this.jenis_lap = " Keuangan ";

		System.out.println(no_lap);
		System.out.println(tgl_lap);
		System.out.println(jenis_lap);
	}
	public void ubah_lap() {

	}
	public void hapus_lap() {

	}
	public void buat_lap() {
		System.out.println("Masukan nomor laporan : ");
		lap.no_lap = input.nextLine();
		System.out.println("Masukan tanggal laporan : ");
		lap.tgl_lap = input.nextLine();
		System.out.println("Masukan jenis laporan : ");
		lap.jenis_lap = input.nextLine();
	}
	public boolean apakahHabis() {
		return true;
	}
}