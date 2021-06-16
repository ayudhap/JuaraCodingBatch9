package com.juaracoding.main;

import java.util.ArrayList;
import java.util.List;

import com.juaracoding.interfaces.KeluargaYudha;
import com.juaracoding.oop.*;

public class Keluarga {

	public static void main(String[] args) {
		Kakek kakek = new Kakek();
		kakek.prestasi();

		Ayah ayah = new Ayah();
		ayah.prestasi();
		ayah.punyaGadget();
		ayah.getNama();

		Ibu ibu = new Ibu();

		List<KeluargaYudha> listKeluarga = new ArrayList<KeluargaYudha>();
		listKeluarga.add(kakek);
		listKeluarga.add(ayah);
		listKeluarga.add(ibu);

		for (KeluargaYudha keluargaYudha : listKeluarga) {
			keluargaYudha.keluargaYudha();
		}
	}

}
