package ar.com.educacionit.interfaces;

public interface Ilogger {
	//definir el contrato
	public void log();
	public  default void  log1() {
		System.out.println("este es el metodo por defecto");
		System.out.println("-------------------------------");
	}
	

}
