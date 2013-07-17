package dao;

import java.util.ArrayList;
import java.util.List;

import model.Material;

public class BancoMaterial {

	static List<Material> materiais = new ArrayList<Material>();
	
	public static void add(Material material){
		materiais.add(material);
	}

	public static List<Material> list() {
		return materiais;
	}
	
}
