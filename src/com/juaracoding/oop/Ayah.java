package com.juaracoding.oop;

public class Ayah extends Kakek {

	public Ayah() {
		System.out.println("Konstruktor Ayah diinisiasi");
	}

	@Override
	public void getNama() {
		System.out.println("Rafi");
	}

	@Override
	public void prestasi() {
		System.out.println("Prestasi Ayah :");
		System.out.println("1. Menjadi dokter terkenal");
		super.prestasi();
	}

	public void punyaGadget() {
		System.out.println("Gadget saya iPhone");
	}
	
	@Override
	public void keluargaYudha() {
		System.out.println("Saya adalah turunan pertama keluarga ini");
	}
}
