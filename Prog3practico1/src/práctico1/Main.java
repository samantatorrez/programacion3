package práctico1;

import java.util.Iterator;


public class Main {
	
	//O(n^2) for dentro de for	- en el peor caso de recorren todos los elementos de cada lista
	
	// Tarda menos porque en el peor de los casos tiene que insertar en el final
	public static ListaOrdenada getListaElementosComunesDesordenadas(ListaSimple lista1, ListaSimple lista2) {
		ListaOrdenada resultado= new ListaOrdenada();
		Iterator iterador1= lista1.iterator();
		Iterator iterador2;
        while(iterador1.hasNext()) {
        	Nodo element = (Nodo) iterador1.next();
        	iterador2= lista2.iterator();
            while(iterador2.hasNext()) {
            	Nodo element2 = (Nodo) iterador2.next();
            	if(element.getInfo() == element2.getInfo()) {
            		resultado.insert(element.getInfo());
            		//System.out.println(element.getInfo());
            	}
            }
        }
		return resultado;
	}
	
	// Tarda mas porque tiene que insertar hasta el final de la lista siempre
	public static ListaOrdenada getListaElementosComunesOrdenadas(ListaSimple lista1, ListaSimple lista2) {
		ListaOrdenada resultado= new ListaOrdenada();
		Iterator iterador1= lista1.iterator();
		Iterator iterador2;
        while(iterador1.hasNext()) {
        	Nodo element = (Nodo) iterador1.next();
        	iterador2= lista2.iterator();
            while(iterador2.hasNext()) {
            	Nodo element2 = (Nodo) iterador2.next();
            	if(element.getInfo() == element2.getInfo()) {
            		resultado.insertLast(element.getInfo());
            		//System.out.println(element.getInfo());
            	}
            	if((int)element.getInfo() < (int)element2.getInfo()) {
            		break;
            	}
            }
        }
		return resultado;
	}
	public static void main(String[] args) {
		long time_start, time_end = 0;
		int cantidadElementos=10;//5,10,50,100,500,1000
		//De 5 a 100 no se ven diferencias
		//De 500 a 1000 se ve que tarda mas el proceso con listas ordenadas

		// LISTAS DESORDENADAS
		ListaSimple lista1= new ListaSimple(cantidadElementos);
        System.out.println(">Lista desordenada 1");
        //lista1.print();
        ListaSimple lista2= new ListaSimple(cantidadElementos);
        System.out.println(">Lista desordenada 2");
        //lista2.print();
        System.out.println(">Lista resultado ordenada (lista 1 + 2)");
        time_start = System.currentTimeMillis();
        ListaOrdenada lista3=getListaElementosComunesDesordenadas(lista1,lista2);
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo: "+ ( time_end - time_start ) +" milliseconds");
        //lista3.print();
        
        // LISTAS ORDENADAS
        System.out.println(">Lista ordenada 4");
        ListaOrdenada lista4= new ListaOrdenada(cantidadElementos);
        //lista4.print();
        System.out.println(">Lista ordenada 5");
        ListaOrdenada lista5= new ListaOrdenada(cantidadElementos);
        //lista5.print();
        System.out.println(">Lista resultado ordenada (lista 4 + 5)");
        time_start = System.currentTimeMillis();
        ListaOrdenada lista6= getListaElementosComunesOrdenadas(lista4,lista5);
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo: "+ ( time_end - time_start ) +" milliseconds");
        //lista6.print();
	}

}
