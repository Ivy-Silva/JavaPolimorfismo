package reinoAnimal;

public class Cachorro extends Animal { 
	
	//métodos da classe principal (super)
	
	public Cachorro() {
		super("Cachorro"); // super é a classe pai (conceito de herança)
	}
	
	public void fazSom(String som) {
		System.out.println("O cachorro faz " +som);
	}
	
	@Override
	public void possuiNome(String nome) {	
	}

	@Override
	public void possuiIdade(int idade) {		
	}
	//fim dos métodos super
	
	//método do cachorro
	public void correr() {
			
	}

	@Override
	public void examinar(String exame) {
		
	}

}
