package tudaitp5;

public class Tablero {
	private int[][] tablero;
	private int[] sumColum;
	private int[] sumFila;
	private int size;

	public Tablero(int n){
		this.tablero=new int[n][n];
		this.sumColum=new int[n];
		this.sumFila=new int[n];
		this.size=n;
		init();
	}
	private void init(){
		for(int i = 0; i< size; i++){
			this.sumColum[i]=-1;
			this.sumFila[i]=-1;
			for(int j = 0; j< size; j++){
				this.tablero[i][j]=-1;
			}
		}
	}
	public boolean addElement(int ele){
		System.out.println("Tablero add: " + ele);
		for(int i = 0; i< size; i++){
			for(int j = 0; j< size; j++){
				if(tablero[i][j]==-1){
					this.tablero[i][j]=ele;
					this.sumColum[j]=this.sumColum[j]+(this.sumColum[j]!=-1 ? ele : ele+1);
					this.sumFila[i]=this.sumFila[i]+(this.sumFila[i]!=-1 ? ele: ele+1) ;
					return true;
				}
				System.out.print(" " +tablero[i][j]+ " ");
			}
		}
		//no se puede agregar mas elementos
		return false;
	}
	public Tablero copy(){
		Tablero nuevo = new Tablero(tablero.length);
		nuevo.tablero = tablero.clone();
		nuevo.sumColum = sumColum.clone();
		nuevo.sumFila = sumFila.clone();
		return nuevo;
	}

	public int getSumColum (int i){
		if(i<size){
			return sumColum[i];
		} return -2;
	}
	public int getSumFila (int i){
		if(i<size){
			return sumFila[i];
		} return -2;
	}
	public void print(){
		System.out.println("Tablero ");
		for(int i = 0; i< size; i++){
			for(int j = 0; j< size; j++){
				System.out.print(" " +tablero[i][j]+ " ");
			}
			System.out.println("");
		}
	}
	public boolean completo() {
		for(int i = 0; i< size; i++){
			for(int j = 0; j< size; j++){
				if(tablero[i][j]==-1){
					return false;
				}
			}
		} return true;
	}
	public boolean FilasColumnasSuman(int s) {
		for(int i=0; i< size;i++){
			if (this.sumColum[i]!=s || this.sumFila[i]!=s){
				return false;
			}
		}
		return true;
	}

	public int getSize() {
		return size;
	}
	public boolean esColumCompleta(int j) {
		for(int i=0; i< size;i++){
			if (tablero[i][j] ==-1) {
				return false;
			}
		}
		return true;
	}
	public boolean esFilaCompleta(int i) {
		for(int j=0; j< size;j++){
			if (tablero[i][j] ==-1) {
				return false;
			}
		}
		return true;
	}
}
