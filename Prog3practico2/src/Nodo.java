
public class Nodo {
	private Integer element;
	private Nodo left;
	private Nodo right;
	
	public Nodo() {
		this.left=null;
		this.right=null;
		this.element=0;
	}
	
	public Nodo(Integer element, Nodo left, Nodo right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}

	public Integer getElement() {
		return element;
	}
	public void setElement(Integer element) {
		this.element = element;
	}
	public Nodo getLeft() {
		return left;
	}
	public void setLeft(Nodo left) {
		this.left = left;
	}
	public Nodo getRight() {
		return right;
	}
	public void setRight(Nodo right) {
		this.right = right;
	}
	public boolean isLeaf() {
		return getLeft() == null || getRight() == null;
	}
}
