package com.juaracoding.oop;

import java.util.Scanner;

import com.juaracoding.interfaces.Suara;

public class Monster extends Character implements Suara {
	
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
	
	public void killHero() {
		System.out.println("Monster : Come here, human !");
	}
	
	@Override
	public void suara() {
		System.out.println("Monster : Aaarrrggghhh !");
	}
}
