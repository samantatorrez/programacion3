import java.util.List;

public interface Arbol {
	public Object getRoot();//
	public boolean hasElem(Object e);//
	public boolean isEmpty();//
	public void insert(Object e);//
	public boolean delete(Object e);
	public int getHeight();
	public void printPosOrder();//
	public void printPreOrder();//
	public void printInOrder();//
	public List getLongestBranch(); 
	public List getFrontera();
	public Object getMaxElem();
	public List getElemAtLevel(int i);
}
