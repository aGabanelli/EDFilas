package controller;

import fatec.sp.gov.lib.filas.FilaGenerica;

public class FilaController {
	
	public FilaController() {
		super();
	}

	public void inserirFila(FilaGenerica<String> fila, String tipo, int contador) {
		if(tipo == "Normal") {
			String senha = "N" + (contador);
			fila.insert(senha);
			System.out.println(senha + " adicionada à fila.");
		} else if (tipo == "Prioritária") {
			String senha = "P" + (contador);
			fila.insert(senha);
			System.out.println(senha + " adicionada à fila.");
		}
	}

	public void chamarPessoa(FilaGenerica<String> fila, FilaGenerica<String> filaPrioritarios, int prioridadeContagem) throws Exception {
		if (prioridadeContagem < 3 && !filaPrioritarios.isEmpty()) {
            removerFila(filaPrioritarios);
        } else if (!fila.isEmpty()) {
            removerFila(fila);
        } else if (!filaPrioritarios.isEmpty()) {
            removerFila(filaPrioritarios);
        } else {
            System.out.println("Não há pessoas na fila para chamar.");
        }
	}

	private void removerFila(FilaGenerica<String> fila) throws Exception {
		if (fila.isEmpty()) {
			System.out.println("A fila está vazia.");
		} else {
			String senhaRemovida = fila.remove();
			System.out.println(senhaRemovida + " foi chamada.");
		}
	}
	
	
	
	
	
	
}
