package com.juaracoding.latihan;

public class Latihan2 {

	int a = 10;
	String gender = "female";

	public void angka() {
		if (a % 2 == 0) {
			System.out.println(a + " adalah genap");
		} else if (a % 2 == 1) {
			System.out.println(a + "adalah ganjil");
		} else {
			System.out.println(a + "tidak diketahui");
		}
	}

	public void kelamin() {
		if (gender.equalsIgnoreCase("female")) {
			System.out.println("Perempuan");
		} else if (gender.equalsIgnoreCase("male")) {
			System.out.println("Laki-Laki");
		} else {
			System.out.println("Tidak ada kelamin");
		}
	}

	public static void main(String[] args) {
		Latihan2 main = new Latihan2();
		main.angka();
		main.kelamin();
	}

}
