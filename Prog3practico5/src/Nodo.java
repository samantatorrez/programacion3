
public class Nodo {
	private int[][] tablero;
	private Nodo[] nodos;
	
	public Nodo(int n) {
		this.tablero = new int[n][n];
		this.nodos = new Nodo[n];
		init();
	}
	private void init() {
		for(int i=0; i< tablero.length;i++) {
			for(int j=0; j< tablero.length;j++) {
				tablero[i][j]=-1;
			}
		}
	}

	public int[][] getTablero() {
		return tablero;
	}
	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}
	public Nodo[] getNodos() {
		return nodos;
	}
	public void setNodos(Nodo[] nodos) {
		this.nodos = nodos;
	}
	
}
