package práctico1;

public class Nodo {
	private Object info;
	private Nodo next;
	public Nodo(Object info, Nodo next) {
		this.setInfo(info);
		this.setNext(next);
	}
	public Object getInfo() {
		return this.info;
	}
	public void setInfo(Object info) {
		this.info = info;
	}
	public Nodo getNext() {
		return next;
	}
	public void setNext(Nodo next) {
		this.next = next;
	}
	
	
}
