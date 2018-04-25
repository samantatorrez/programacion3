
public class main {

	public static void main(String[] args) {
		int[] myIntArray = {15, 6, 3, 2, 4, 7, 13, 9, 18, 17, 20};
		ArbolBinario bst = new ArbolBinario(myIntArray);
		// Pre-orden 15, 6, 3, 2, 4, 7, 13, 9, 18, 17, 20
		bst.printPreOrder(); 
		// Post-orden 2, 4, 3, 9, 13, 7, 6, 17, 20, 18, 15
		//bst.printPosOrder(); 
		//En-orden 2, 3, 4, 6, 7, 9, 13, 15, 17, 18, 20
		//bst.printInOrder();
		//Empty?
		//ArbolBinario vacio = new ArbolBinario();
		//System.out.println(vacio.isEmpty());
		//System.out.println(bst.isEmpty());
		//hasElem
		//System.out.println(bst.hasElem(20));
	}

}
