package tudaitp5;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static Tablero backtracking (Tablero t, int s, List<Integer> candidatos){
		Tablero resultado = null;
		if(solucion(t,s)){ 
			 resultado= t;
		} else {
			while(!candidatos.isEmpty() && !t.completo()){
				Tablero siguiente = t.copy();
				siguiente.addElement(candidatos.get(0));
				candidatos.remove(0);
				List<Tablero> hijos= getHijos(siguiente,candidatos);
				for(Tablero hijo: hijos){
					if(!poda(hijo,s)){
						backtracking(siguiente,s,candidatos);
					}
				}
			}
		}
		
		return resultado;
	}
	private static boolean poda(Tablero hijo,int s) {
		for(int i = 0; i< hijo.getSize();i++){
			if(hijo.getSumColum(i)>s || hijo.getSumFila(i)> s 
				|| (hijo.esColumCompleta(i)&& hijo.getSumColum(i)!=s)
				|| (hijo.esFilaCompleta(i)&&hijo.getSumFila(i)!=s)) {
				return true;
			}
		}
		return false;
	}
	private static List<Tablero> getHijos(Tablero t, List<Integer> candidatos) {
		List<Tablero> hijos= new ArrayList<Tablero>();
		Tablero hijo;
		for(Integer candidato: candidatos){
			hijo=t.copy();
			if(hijo.addElement(candidato)){
				hijos.add(hijo);
			}
		}
		return hijos;
	}
	private static boolean solucion(Tablero t, int s) {
		return t.completo() && t.FilasColumnasSuman(s);
	}
	public static void main(String[] args) {
		Tablero t = new Tablero(3);
		t.print();

	}

}
