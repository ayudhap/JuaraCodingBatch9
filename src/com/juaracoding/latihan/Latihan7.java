package com.juaracoding.latihan;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Latihan7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan Nama Anda ? ");
		String nama = sc.next();
		String regexNama = "^[a-zA-Z \\-\\.\\']*$";
		String regexEmail = "^(.+)@(.+)$";
		Pattern pNama = Pattern.compile(regexNama, Pattern.CASE_INSENSITIVE);
		Pattern pEmail = Pattern.compile(regexEmail, Pattern.CASE_INSENSITIVE);
		Matcher mNama = pNama.matcher(nama);
		while (mNama.find() == false) {
			System.out.println("Mohon maaf nama tidak boleh ada karakter numerik");
			System.out.print("Masukkan Nama Anda ? ");
			nama = sc.next();
		}
		System.out.println("Masukkan Email Anda ? ");
		String email = sc.next();
		Matcher mEmail = pEmail.matcher(email);
		while (mEmail.find() == false) {
			System.out.println("Mohon maaf email anda salah");
			System.out.print("Masukkan Email Anda ? ");
			email = sc.next();
		}
		System.out.println("********************");
		System.out.println("Nama : " + nama);
		System.out.println("Email : " + email);
		System.out.println("********************");
	}
}
