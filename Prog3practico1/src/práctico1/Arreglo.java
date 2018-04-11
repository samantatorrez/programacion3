package práctico1;

public class Arreglo implements Lista{
	int[] arreglo;
	
	public Arreglo(){
		this.arreglo= new int[10];
	}
	
	public Arreglo(int n){
		this.arreglo= new int[n];
	}
	
	@Override
	public void insert(Object o) {
		this.arreglo.
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
