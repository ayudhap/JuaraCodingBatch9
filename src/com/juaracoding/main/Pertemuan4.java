package com.juaracoding.main;

import java.util.Scanner;

public class Pertemuan4 {

	int matriks[][] = new int[2][3];
	int a = matriks.length;
	int b = matriks[1].length;

	public void matriks() {
		matriks[0][0] = 3;
		matriks[0][1] = 4;
		matriks[0][2] = 4;
		matriks[1][0] = 3;
		matriks[1][1] = 5;
		matriks[1][2] = 5;
		for (int i = 0; i < matriks.length; i++) {
			for (int j = 0; j < matriks[i].length; j++) {
				System.out.print(matriks[i][j]);
			}
			System.out.println();
		}
	}

	public void inputMatriks() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Baris = ");
		int baris = scanner.nextInt();
		System.out.print("Masukkan Kolom = ");
		int kolom = scanner.nextInt();
		int matriks[][] = new int[baris][kolom];
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print("Masukkan array ke [" + i + "][" + j + "] = ");
				matriks[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print(matriks[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pertemuan4 main = new Pertemuan4();
//		main.matriks();
		main.inputMatriks();
	}

}
