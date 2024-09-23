package model;

public class PilhaInt<T> {

	No<T> topo;
	
	public PilhaInt() {
		topo = null;
	}
	
	public Boolean isEmpty() {
		if(topo == null) {
			return true;
		}
		return false;
	}
	
	public void Push(T e) {
		No<T> elemento = new No<T>();
		elemento.dado = e;
		if(isEmpty()) {
			topo = elemento;			
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	public T Pop() throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Não há elementos para empilhar");
		}
		T valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public T Top() throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Não há elementos na pilha");
		}
		T valor = topo.dado;
		return valor;
	}
	
	public int Size() {
		int cont = 0;
		if(isEmpty() == false) {
			No<T> auxiliar = topo;
			cont = 1;
			while(auxiliar.proximo != null) {
				cont = cont + 1;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
}
