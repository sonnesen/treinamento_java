package cast;

import encapsulamento.Pessoa;

public class CastUpSample {

	Cliente cliente = new Cliente();
	
	Pessoa pessoa = (Pessoa) cliente;
	
	Pessoa juca = cliente;
	
	Pessoa zeca = new Cliente();
	
	Object objeto = (Object) cliente;
	
	Object outroObjeto = cliente;
}
