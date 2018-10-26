package singleton;

import java.sql.Connection;

public class Testador {

	public static void main(String[] args) {
//		Singleton s = Singleton.getInstance();
//		Singleton s2 = Singleton.getInstance();
//		Singleton s3 = Singleton.getInstance();
//		
//		System.out.println(s);
//		System.out.println(s2);
//		System.out.println(s3);
		
		
		Connection conec = Conexao.getInstance();
		Connection conec2 = Conexao.getInstance();
		Connection conec3= Conexao.getInstance();
		
		System.out.println(conec);
		System.out.println(conec2);
		System.out.println(conec3);
		
		Conexao.fechaConexao();
		Conexao.fechaConexao();
		
		System.out.println(conec);
		System.out.println(conec2);
		System.out.println(conec3);
	}

}
