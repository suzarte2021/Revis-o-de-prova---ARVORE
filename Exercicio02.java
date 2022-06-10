package UsandoPilha;
import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;

public class Exercicio02 {

	/*/Escreva um programa que leia 10 números, armazene-os em uma árvore 
	 * e em seguida, liste apenas os números pares. 
	 * Pode utilizar qualquer caminhamento.
	 
/*/
	
	//Vamos empilhar os numeros
	public static void main(String[] args) {	
	Stack<Integer> pilhaPar = new Stack<Integer>();
	
  
		Scanner scan = new Scanner(System.in);  // Entrada de dados
		
		for (int i=1; i<=10; i++) {
			System.out.println("Digite um número");
			int num = scan.nextInt();   //Recebe o dado colocado
		
		
			if(num % 2 ==0) { // Se o núemero for par
				System.out.println("Os números pares armazenados são:" + num);
				pilhaPar.empty(); 
			
			}else {
				System.out.println("");
				
			}
			
		 //Imprimindo com Iterator
			Iterator<Integer> p = pilhaPar.iterator();
			while (p.hasNext()) {
			System.out.println(p.next().toString());
			}
			
			}
		}
	}



