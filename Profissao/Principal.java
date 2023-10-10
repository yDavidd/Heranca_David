package Profissao;


public class Principal {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario ("David Kauan", "34523", 3000, "(15)998451620", "EUA, Los Angeles", "20/09/1998");
		System.out.println("Funcionário: ");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matrícula: " + funcionario.getMatricula());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Endereço: " + funcionario.getEndereco());
		System.out.println("Data Nascimento: " + funcionario.getDataNascimento());
		
		Administrador administrador = new Administrador ("Guilherme Celestino", "34524", 2000, "(15)995434958", "EUA, Los Angeles", "13/02/1996", 30873200);
		System.out.println("\nAdministrador: ");
		System.out.println("Nome: " + administrador.getNome());
		System.out.println("Matrícula: " + administrador.getMatricula());
		System.out.println("Salário: " + administrador.getSalario());
		System.out.println("Telefone: " + administrador.getTelefone());
		System.out.println("Endereço: " + administrador.getEndereco());
		System.out.println("Data Nascimento: " + administrador.getDataNascimento());
		System.out.println("Cra: " + administrador.getCra());
		
		Engenheiro engenheiro = new Engenheiro ("Luiz Guilherme", "34525", 5000, "(15)995476532", "EUA, Los Angeles", "06/07/1993", 30873200);
		System.out.println("\nEngenheiro: ");
		System.out.println("Nome: " + engenheiro.getNome());
		System.out.println("Matrícula: " + engenheiro.getMatricula());
		System.out.println("Salário: " + engenheiro.getSalario());
		System.out.println("Telefone: " + engenheiro.getTelefone());
		System.out.println("Endereço: " + engenheiro.getEndereco());
		System.out.println("Data Nascimento: " + engenheiro.getDataNascimento());
		System.out.println("Crea: " + engenheiro.getNumCrea());
		
		Medico medico = new Medico ("Giovana Santana", "34526", 10000, "(15)997457891", "EUA, Los Angeles", "19/04/1995", 30873200);
		System.out.println("\nMédica: ");
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Matrícula: " + medico.getMatricula());
		System.out.println("Salário: " + medico.getSalario());
		System.out.println("Telefone: " + medico.getTelefone());
		System.out.println("Endereço: " + medico.getEndereco());
		System.out.println("Data Nascimento: " + medico.getDataNascimento());
		System.out.println("Crm: " + medico.getCrm());
		
		

		
		
		
		

	}

}
