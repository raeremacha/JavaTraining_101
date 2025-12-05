/**
 * 
 */
package seatwork1;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book();
		House house = new House();
		Tree tree = new Tree();
		
		book.title = "Noli Me Tangere";
		book.page = 500;
		book.bookdetail();
		
		house.address = "Baguio";
		house.houseno = 35;
		house.housedetail();
			
		tree.treetype = "Pine Tree";
		tree.treeheight = 12;
		tree.treedetail();
	}

}
