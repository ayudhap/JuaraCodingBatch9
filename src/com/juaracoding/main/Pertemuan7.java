package com.juaracoding.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pertemuan7 {

	public String inputData(String teks) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(teks);
		String jawab = scanner.next();
		return jawab;
	}

	public boolean validasiHanyaAlphabet(String kata) {
		String regex = "^[a-zA-Z\\\\s]+";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(kata);
		return matcher.find();
	}
	
	public boolean validasiEmail(String email) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		return matcher.find();
	}
	
	public static void main(String[] args) {
		Pertemuan7 main = new Pertemuan7();
		String nama = main.inputData("Masukkan Nama Anda ? ");
		while (!main.validasiHanyaAlphabet(nama)) {
			System.out.println("Mohon maaf nama tidak boleh ada karakter numerik");
			nama = main.inputData("Masukkan Nama Anda ? ");
		}
		String email = main.inputData("Masukkan Email Anda ? ");
		while (!main.validasiEmail(email)) {
			System.out.println("Mohon maaf email anda salah");
			email = main.inputData("Masukkan Email Anda ? ");
		}
		System.out.println("********************");
		System.out.println("Nama : " + nama);
		System.out.println("Email : " + email);
		System.out.println("********************");
	}

}
