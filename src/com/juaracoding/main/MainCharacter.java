package com.juaracoding.main;

import com.juaracoding.oop.*;

public class MainCharacter {

	public static void main(String[] args) {
		int monsterHP;
		int heroHP;
		Hero hero = new Hero();
		Monster monster = new Monster();
		System.out.print("Masukkan Hero HP = ");
		hero.setHP();
		System.out.print("Masukkan Hero STR = ");
		hero.setStr();
		System.out.print("Masukkan Monster HP = ");
		monster.setHP();
		System.out.print("Masukkan Monster STR = ");
		monster.setStr();
		if (hero.killMonster().equalsIgnoreCase("ya")) {
			monster.suara();
			monsterHP = monster.getHP() - hero.getStr();
			System.out.println("Sisa HP Monster = " + monsterHP);
			if (monsterHP > 0) {
				monster.killHero();
				heroHP = hero.getHP() - monster.getStr();
				System.out.println("Sisa HP Hero = " + heroHP);
				while (monsterHP > 0 && heroHP > 0) {
					if (hero.killMonster().equalsIgnoreCase("ya")) {
						monster.suara();
						monsterHP -= hero.getStr();
						System.out.println("Sisa HP Monster = " + monsterHP);
						if (heroHP != 0) {
							monster.killHero();
							heroHP -= monster.getStr();
							System.out.println("Sisa HP Hero = " + heroHP);
						}
					}
				}
				if (heroHP == 0) {
					System.out.println("Hero telah mati");
				} else if (monsterHP == 0) {
					System.out.println("Monster telah mati");
				}
			}
		}
		System.out.println("Game selesai");
	}
}
