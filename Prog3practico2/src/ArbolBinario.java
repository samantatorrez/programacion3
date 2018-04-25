import java.util.List;

import org.omg.PortableServer.ServantRetentionPolicyOperations;

public class ArbolBinario implements Arbol{
	private Nodo root;
	private int level;
	private int count; // al insertar, eliminar, crear
	
	public ArbolBinario() {
		this.root = null;
		this.setCount(0);
		this.level= 0;
	}
	
	public ArbolBinario(int n) {
		for(int i=0; i<n;i++) {
			insert((int)(Math.floor(Math.random() * 10) + 1));
		}
	}
	public ArbolBinario(int[] array) {
		for(int i=0; i<array.length; i++) {
			insert(array[i]);
		}
	}

	@Override // O(1)
	public Object getRoot() {
		return this.root;
	}

	@Override // BUSQUEDA O(h)
	public boolean hasElem(Object e) {
		return hasElem((Integer) e, root);
	}

	private boolean hasElem(Integer e, Nodo actual) {
		boolean isPresent= false;
		if(actual!=null) {
			if(e.equals(actual.getElement())) {
				isPresent = true;
			} else if (e.compareTo(actual.getElement())<0) {
				isPresent = isPresent || hasElem(e,actual.getLeft());
			} else {
				isPresent = isPresent || hasElem(e,actual.getRight());
			}
		}
		return isPresent;
	}

	@Override // O(1)
	public boolean isEmpty() {
		return root == null;
	}

	@Override // O(h)
	public void insert(Object e) {
		Nodo nuevoNodo = new Nodo((Integer) e,null,null);
		if (root == null) {
			root = nuevoNodo;
		} else {
			insert(nuevoNodo, root);
		}
		count++;
	}

	private Nodo insert(Nodo nuevoNodo, Nodo actual) {
		if(actual == null) {
			return nuevoNodo;
		} else {
			int comparation = nuevoNodo.getElement().compareTo(actual.getElement());
			if(comparation < 0) {
				actual.setLeft(insert(nuevoNodo,actual.getLeft()));
			} else {
				actual.setRight(insert(nuevoNodo,actual.getRight()));
			}
		}
		return actual;
	}

	@Override
	public boolean delete(Object e) {
		return true;
		//to do
	/*	if(root==null) {
			return false;
		}
		return  delete((Integer) e, root) != null ? true : false;
		*/
	}
/*
	private Integer getNMI(Nodo actual) {
		if(actual.isLeaf()) {
			return actual.getElement();
		} else {
			return getNMI(actual.getLeft());
		}
	}
	private Nodo delete(Integer e, Nodo actual) {
		if(actual != null) {
			if(actual.getElement().equals(e)) {
				if(actual.isLeaf()) {
					return null;
				} else {
					Integer nmi= getNMI(actual.getRight());
					actual.setElement(nmi);
					actual.setRight(delete(nmi,actual.getRight()));
					return actual;
				}
		} else {
			if(e < actual.getElement()) {
				actual.setLeft(delete(e,actual.getLeft()));
			} else {
				actual.setRight(delete(e,actual.getRight()));
			}
		}
		}
		return actual;
		}
*/		
		
	

	@Override 
	public int getHeight() {
		//to do
		return 0;
		//return getHeight(root);
	}
	
	/*private int getHeight( Nodo actual) {
		if(actual == null) {
			return -1;
		} 
		return max(getHeight(actual.getLeft()),getHeight(actual.getRight())) + 1;
	}

	private int max(int height, int height2) {
		if(height < height2) {
			return height2;
		} return height;
	}*/

	@Override // O(n)
	public void printPosOrder() {
		printPosOrder(root);
		
	}

	private void printPosOrder(Nodo actual) {
		if(actual != null) {
			printPosOrder(actual.getLeft());
			printPosOrder(actual.getRight());
			System.out.println(actual.getElement());
		}
	}

	@Override // O(n)
	public void printPreOrder() {
		printPreOrden(root);
		
	}

	private void printPreOrden(Nodo actual) {
		if(actual != null) {
			System.out.println(actual.getElement());
			printPreOrden(actual.getLeft());
			printPreOrden(actual.getRight());
		}
	}
	@Override // O(n)
	public void printInOrder() {
		printInOrder(root);
	}

	private void printInOrder(Nodo actual) {
		if(actual != null) {
			printInOrder(actual.getLeft());
			System.out.println(actual.getElement());
			printInOrder(actual.getRight());
		}
	}

	@Override // 
	public List getLongestBranch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getFrontera() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getMaxElem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getElemAtLevel(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
