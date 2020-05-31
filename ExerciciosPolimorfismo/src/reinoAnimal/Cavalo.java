package reinoAnimal;

public class Cavalo extends Animal {
	
	//métodos da classe principal (super)
	public Cavalo() {
		super("Cavalo");
	}

	public void fazSom(String som) {
		System.out.println("O cavalo faz " +som);
	}

	@Override
	public void possuiNome(String nome) {
	}

	@Override
	public void possuiIdade(int idade) {	
	}
	// fim dos métodos super
	
	//método do cavalo
	public void correr() {
			
	}

	@Override
	public void examinar(String exame) {
		
	}

}
