package de.telekom.sea7;

public class DepotImpl<T> {

	private T[] liste = ((T[]) new Object[9]);
	private int size;

	public T get(int index) {
		return liste[index];
	}
	public int size() {
		return size;
	}
	public void add(T element) {
		this.liste[size++] = element;
	}
	public String toString() {
		String ausgabe = "";
		for (int i = 0; i < liste.length; i++) {
			var element = liste[i];
			if (element == null)
				ausgabe = ausgabe + "null, ";
			else
				ausgabe += element.toString() + ", ";
		}
		return ausgabe;
	}
}
