package ar.com.educacionit.interfaces;

public interface IIDioma {
	public void decir(String palabra);
	public default void noSeDecir(String palabra) {
		System.out.println("No se decir "+ palabra);
	};
}
