package AvaliaçãoFormativa;

public class Principal {

	public static void main(String[] args) {
		Usuario us = new Usuario(1,"cainan",21221,"autorizado","adm");
		System.out.println(us.getId());
		System.out.println(us.getNome());
		System.out.println(us.getPassword());
		System.out.println(us.getPermissao());
		System.out.println(us.getUsuario());
	}

}
