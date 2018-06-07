
public class main {

	public static void backtracking (Tablero t, int s, Integer[] candidatos){
		if(solucion(t,s)){ 
			 t.print();
		} else {
			if(!poda(t,s)){
				for(int i=0;i<candidatos.length;i++) {
					if(candidatos[i]==0) {
							candidatos[i]=1;
							t.addElement(i);
							backtracking(t,s,candidatos);
							candidatos[i]=0;
							t.deleteElement(i);
					}
				}
			}
		}
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
	private static boolean solucion(Tablero t, int s) {
		return t.completo() && t.FilasColumnasSuman(s);
	}
	public static void main(String[] args) {
		Tablero t = new Tablero(3);
		int s = 15;
		int k = 12;
		Integer[] candidatos= new Integer[k+1];
		for(int i=0; i<=k;i++) {
			candidatos[i]=0;
		}
		backtracking(t,s,candidatos);

	}

}
