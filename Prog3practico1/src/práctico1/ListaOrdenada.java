package práctico1;

import java.util.Iterator;

public class ListaOrdenada extends ListaSimple {

	public ListaOrdenada(int i) {
		super(i);
	}

	public ListaOrdenada() {
		super();
	}

	@Override
	// si la lista esta vacia entonces es first
	// recorre la lista hasta que encuentra que hay un valor menor e inserta el nodo
	public void insert(Object o) {
		Nodo tmp = new Nodo(o,null);
        if(this.tamaño==0) {
    		this.first=tmp;
    		
        } else {
        Nodo previous = null;
        Nodo actual=null;
        Iterator itr= iterator();
        while(itr.hasNext()) {
        	actual = (Nodo) itr.next();
        	if ((int)tmp.getInfo() <= (int) actual.getInfo() ) {
        		break;
        	}
        	previous = actual;
        }
        if(previous!=null &&  (int)tmp.getInfo() <= (int)actual.getInfo()) {
			tmp.setNext(actual);
			previous.setNext(tmp);
		} else if(previous!=null && (int)tmp.getInfo() > (int)actual.getInfo()) {
			previous.setNext(tmp);
		} else {
			tmp.setNext(first);
			first=tmp;
		}
        }
        this.tamaño++;
	}

	// como se sabe que los elementos vienen ordenados se inserta al final 
	public void insertLast(Object o) {
		Nodo tmp = new Nodo(o,null);
		if (first == null) {
			first= tmp;
		} else {
			Iterator itr= iterator();
			Nodo last= (Nodo) itr.next();
	        while(itr.hasNext()) {
	        	last = (Nodo) itr.next();
	        }
	        last.setNext(tmp);
		}
		
		
	}

}
