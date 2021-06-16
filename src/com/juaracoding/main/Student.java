package com.juaracoding.main;

public class Student {
	
	private String nama;
	private int umur;
	private int nilai;
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public int getUmur() {
		return umur;
	}
	
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	public int getNilai() {
		return nilai;
	}
	
	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	public static void main(String[] args) {
		Student main = new Student();
		main.setNama("Yudha");
		main.setUmur(23);
		main.setNilai(100);
		System.out.println(main.getNama());
		System.out.println(main.getUmur());
		System.out.println(main.getNilai());
	}

}
