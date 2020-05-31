package reinoAnimal;

public class Preguica extends Animal {
	
	// métodos da classe principal (super)
	public Preguica() {
		super("Preguiça");
	}

	public void fazSom(String som) {
		System.out.println("A preguiça faz " +som);
	}

	@Override
	public void possuiNome(String nome) {
		
	}

	@Override
	public void possuiIdade(int idade) {
		
	}
	//fim dos métodos super
	
	//método da preguiça
	public void subirArvores() {
		
	}

	@Override
	public void examinar(String exame) {
		
	}
}
