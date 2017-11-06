import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Laporan lap = new Laporan();
		lap.cetak();
		Scanner input = new Scanner(System.in);
		lap.jenis_lap = input.nextLine();
		lap.no_lap = input.nextLine();
		lap.tgl_lap = input.nextLine();
	}
}