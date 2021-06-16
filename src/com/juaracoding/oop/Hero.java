package com.juaracoding.oop;

import java.util.Scanner;

import com.juaracoding.interfaces.Suara;

public class Hero extends Character implements Suara {
	
	public void setHP() {
		Scanner scanner = new Scanner(System.in);
		hp = scanner.nextInt();
	}
	
	public int getHP() {
		return hp;
	}
	
	public void setStr() {
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextInt();
	}
	
	public int getStr() {
		return str;
	}
	
	public String killMonster() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bunuh monster ? Ya/Tidak");
		String kill = scanner.next();
		if (kill.equalsIgnoreCase("ya")) {
			System.out.println("Hero : I'll kill you monster !");
		}
		return kill;
	}

	@Override
	public void suara() {
		System.out.println("Damn you, monster !");
	}
}
