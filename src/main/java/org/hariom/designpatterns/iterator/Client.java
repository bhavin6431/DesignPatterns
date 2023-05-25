package org.hariom.designpatterns.iterator;

public class Client {

	public static void main(String args[]) {
		NameRepository nameRespository = new NameRepository();
		for (Iterator it = nameRespository.getIterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}
}
