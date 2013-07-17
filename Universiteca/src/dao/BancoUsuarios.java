package dao;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class BancoUsuarios {

	static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static void add(Usuario usuario){
		usuarios.add(usuario);
	}

	public static List<Usuario> list() {
		return usuarios;
	}
	
	public static void delete(String cpf){
		for(Usuario u : usuarios){
			if(u.getCpf().equals(cpf)){
				usuarios.remove(u);
				return;
			}
		}
	}
}
