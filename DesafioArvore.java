package Arvore;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
public class DesafioArvore {
	/*/Escreva um programa que leia 10 números, armazene-os em uma árvore e, 
	 em seguida, liste apenas os números pares. Pode utilizar qualquer caminhamento.
	 /*/
	public int numeros;
	public DesafioArvore esquerda, direita;
	
	public static void main(String[] args) {
		Stack<Integer>  numerosPares = new Stack<Integer>();
		Scanner dados = new Scanner(System.in);
		DesafioArvore arvore = null;

		arvore = null;
		for (int i = 1; i<=10; i++) {
			System.out.println("Informe um número: ");
			int numerosPares1=dados.nextInt();
			if(numerosPares1 % 2 ==0) { // Se o número for par
				System.out.println("Esse número é par:" + numerosPares1);
				numerosPares.empty(); // Vazia
			}else {
				System.out.println("Esse número não é par");
			}
		}
	}
	//Método para inserir 
	public static DesafioArvore inserir(DesafioArvore aux, int num) {
		if (aux == null) {
			aux = new DesafioArvore();    
			aux.numeros = num;         
			aux.esquerda = null;
			aux.direita = null;
		}else if (num<aux.numeros) {
			aux.esquerda = inserir(aux.esquerda, num);
		}else
			aux.direita = inserir(aux.direita, num);
		return aux;
	}
	public static void ordem(DesafioArvore aux) {
		if (aux != null) {
			ordem(aux.esquerda);
			System.out.println(aux.numeros + " ");
			ordem(aux.direita);
		}
	}
}




