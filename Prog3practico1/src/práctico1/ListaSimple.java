package práctico1;

import java.util.Iterator;

public class ListaSimple implements Lista,
Iterable {
	protected Nodo first;
	protected int tamaño;
	
	public ListaSimple(){
		this.first =null;
		this.tamaño=0;
	}
	public ListaSimple(int n) {
		for(int i=0; i<n; i++) {
			insert((int)(Math.floor(Math.random() * 10) + 1));
		}
	}
	public void insert(Object o){
		Nodo tmp = new Nodo(o,null);
		tmp.setNext(this.first);
		this.first=tmp;
		this.tamaño++;
	}
	public Object extract(){
		if (first != null){
			Object objetoExtraido=first.getInfo();
			Nodo nodoSiguiente=first.getNext();
			if(nodoSiguiente!=null){
				first.setNext(null);
				first=nodoSiguiente;
			} else {
				first=null;
			}
			this.tamaño--;
			return objetoExtraido;
		}
		return null;
	}
	
	public void print(int n){
		if (this.size()<= n){
			Nodo index=first;
			for(int i=1;i<n;i++){
				index=first.getNext();
			}
			System.out.println(index.getInfo().toString());
		}
	}

	public void print(){
		int size = this.size();
		Nodo index=first;
		for(int i=0;i<size;i++){
			System.out.println(index.getInfo().toString());
			index=index.getNext();
		}	
	}
	
	public boolean isEmpty(){
		return first==null;
	}

	//Complejidad O(n) - Mejora: crear variable (llevar un contador) que se actualize cuando se agrega o se eliminé nodos.
	public int size(){
		Nodo index=first;
		int size=0;
		while (index!=null){
			size++;
			index=index.getNext();
		}
		return size;
	}
	public int getTamaño() {
		return tamaño;
	}
	@Override
	public Iterator iterator() {
		return new ListaOrdenadaIterator();
	}
	
	class ListaOrdenadaIterator implements Iterator{
		Nodo actual = null;
		@Override
		public boolean hasNext() {
			if(actual==null && first!= null) {
				return true;
			} else if (actual!=null) {
				return (actual.getNext()!=null);
			}
			return false;
		}

		@Override
		public Nodo next() {
			if(actual==null && first!= null) {
				actual= first;
				return first;
			}
			else if (actual!=null) {
				actual = actual.getNext();
				return actual;
			}
			return null;
		}
		
	}
}
