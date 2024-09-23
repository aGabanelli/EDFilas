package main;

import java.util.Scanner;

import controller.FilaController;
import fatec.sp.gov.lib.filas.FilaGenerica;

public class Principal {

	public static void main(String[] args) throws Exception {
	
		FilaGenerica<String> fila = new FilaGenerica<String>();
		FilaGenerica<String> filaPrioritarios = new FilaGenerica<String>();
		FilaController controller = new FilaController();
		
		Scanner scanner = new Scanner(System.in);
        int contN = 1, contP = 1, opcao = 0, prioridadeContagem = 0;
        
        while(opcao !=4) {
        	System.out.println("1 - Inserir senha na fila normal");
            System.out.println("2 - Inserir senha na fila prioritária");
            System.out.println("3 - Chamar próxima pessoa");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

			switch (opcao) {
                case 1:
                    controller.inserirFila(fila, "Normal", contN);
                    contN++;
                    break;
                case 2:
                    controller.inserirFila(filaPrioritarios, "Prioritária", contP);
                    contP++;
                    break;
                case 3:
                    controller.chamarPessoa(fila, filaPrioritarios, prioridadeContagem);
                    if (!filaPrioritarios.isEmpty()) {
                        prioridadeContagem++;
                    }
                    if (prioridadeContagem == 4) {
                        prioridadeContagem = 0;
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        
	}
	
}