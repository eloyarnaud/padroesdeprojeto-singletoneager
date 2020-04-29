package singleton1;
//Método "Eager" para inicialização de bloco estático

public class Singleton1 {

	private static Singleton1 instance = new Singleton1();

	private Singleton1(){

	}

	//Eager
	public static Singleton1 getInstance(){
		return instance;
	}
}