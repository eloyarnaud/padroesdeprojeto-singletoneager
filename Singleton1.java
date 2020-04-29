package singleton1;
//M�todo "Eager" para inicializa��o de bloco est�tico

public class Singleton1 {

	private static Singleton1 instance = new Singleton1();

	private Singleton1(){

	}

	//Eager
	public static Singleton1 getInstance(){
		return instance;
	}
}