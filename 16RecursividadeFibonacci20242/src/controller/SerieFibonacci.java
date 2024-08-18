package controller;

public class SerieFibonacci {

	public SerieFibonacci() {
		super();
	}
	public int serieFibonacci(int n) {
		//Condição de parada
		if(n <= 1) {
			return n;
		} else {
			//Chamada de função
			return serieFibonacci(n-1)+ serieFibonacci(n-2); 
		}	
	}
}
