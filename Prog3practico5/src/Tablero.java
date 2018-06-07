import java.util.Arrays;

public class Tablero {
	private Integer[][] tablero;
	private Integer[] sumColum;
	private Integer[] sumFila;
	private int size;

	public Tablero(int n){
		this.tablero=new Integer[n][n];
		this.sumColum=new Integer[n];
		this.sumFila=new Integer[n];
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
		for(int i = 0; i< size; i++){
			for(int j = 0; j< size; j++){
				if(tablero[i][j]==-1){
					this.tablero[i][j]=ele;
					this.sumColum[j]=this.sumColum[j]+(this.sumColum[j]!=-1 ? ele : ele+1);
					this.sumFila[i]=this.sumFila[i]+(this.sumFila[i]!=-1 ? ele: ele+1) ;
					return true;
				}
			}
		}
		//no se puede agregar mas elementos
		return false;
	}
	public Tablero copy(){
		Tablero nuevo = new Tablero(tablero.length);
		for(int i=0; i<size; i++){
			for(int j=0; j<size;j++) {
				if(tablero[i][j]!=-1) {
					nuevo.addElement(tablero[i][j]);
				}
			}
		}
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
	public void deleteElement(int k) {
		// TODO Auto-generated method stub
		outerloop:
		for(int i = 0; i< size; i++){
			for(int j = 0; j< size; j++){
				if(tablero[i][j]==k){
					tablero[i][j]=-1;
					sumColum[j]=sumColum[j]-k;
					sumFila[i]=sumFila[i]-k;
					break outerloop;
				}
			}
		}
	}
}