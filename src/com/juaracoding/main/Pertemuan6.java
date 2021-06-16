package com.juaracoding.main;

import java.util.Scanner;

public class Pertemuan6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Masukan jumlah mahasiswa = ");
		int jml = in.nextInt();
		String data[][] = new String[jml][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					System.out.print("Input Nama Mahasiswa ke " + (i + 1) + " = ");
					data[i][j] = in.next();
				} else if (j == 1) {
					System.out.print("Input Nim Mahasiswa ke " + (i + 1) + " = ");
					data[i][j] = in.next();
				} else {
					System.out.print("Input Grade Mahasiswa ke " + (i + 1) + " = ");
					data[i][j] = in.next();
				}
			}
			System.out.println();
		}

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (j == 0) {
					System.out.println("Nama Mahasiswa = " + data[i][j]);
				} else if (j == 1) {
					System.out.println("NIM Mahasiswa = " + data[i][j]);
				} else {
					System.out.println("Grade Mahasiswa = " + data[i][j]);
				}
			}
			System.out.println();
		}

	}

}
