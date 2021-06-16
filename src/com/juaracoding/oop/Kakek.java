package com.juaracoding.oop;

import com.juaracoding.interfaces.KeluargaYudha;

public class Kakek implements KeluargaYudha {

	String nama = "Yudha";

	public void getNama() {
		System.out.println(nama);
	}

//	Constructor
	public Kakek() {
		System.out.println("Kakek diinisiasi");
	}

//	Public modifier
	public void prestasi() {
		System.out.println("Prestasi Kakek :");
		System.out.println("1. Pahlawan perang");
		System.out.println("2. Suka bersedekah");
	}

//	Private modifier
	private void dosa() {
		System.out.println("Dosa Kakek :");
		System.out.println("1. Suka ngibul");
		System.out.println("2. Suka nyolong");
	}

	@Override
	public void keluargaYudha() {
		System.out.println("Saya adalah kakek moyang keluarga ini");
	}

}
