package práctico1;

public class Arreglo implements Lista{
	int[] arreglo;
	
	public Arreglo(){
		this.arreglo= new int[10];
	}
	
	public Arreglo(int n){
		this.arreglo= new int[n];
		for(int i = 0; i<n; i++) {
			arreglo[i] = (int)(Math.floor(Math.random() * 10) + 1);
		}
	}
	
	public int get(int i) {
		return arreglo[i];
	}
	
	@Override
	public void insert(Object o) {
		// TODO Auto-generated method stub
	}

	@Override
	public Object extract() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print(int n) {
		for(int i = 0; i< arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}

	@Override
	public boolean isEmpty() {
		return arreglo.length==0;
	}

	@Override
	public int size() {
		return arreglo.length;
	}
	
}
