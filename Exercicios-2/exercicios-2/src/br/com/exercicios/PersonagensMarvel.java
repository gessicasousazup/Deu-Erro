package br.com.exercicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*Faça um programa que receba do usuário o nome de personagens da Marvel até que
 * o nome Homem de Ferro seja lido. Todos devem ser inseridos em um ArrayList e
 * depois exibidos na tela um abaixo do outro.
 *Adapte o exercício anterior para que o mesmo, 
 *após receber um nome, exibir as informações na tela e 
 *apresente um menu onde o usuário possa escolher entre as seguintes operações:
 *
 *Digite um nome de personagem para verificar se o mesmo já está cadastrado.
 *Digite o nome do personagem que deseja retirar da lista.
 *Digite o nome do personagem que deseja alterar o nome.  */


public class PersonagensMarvel {

	public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);	
    
    List<String> arrayList = new ArrayList<String>();
	
    //Contador
    String nome = "";
    //Condição
    while(!nome.equalsIgnoreCase ("Homem de Ferro")) {
    	
    	//Passo
        System.out.println("Digite um nome de Personagem da Marvel:");
        nome=input.nextLine();
    	arrayList.add(nome);
    	
    	
    } 
		input.close();
	
	}

}

	

	
	
	
	
	
	
	
	

