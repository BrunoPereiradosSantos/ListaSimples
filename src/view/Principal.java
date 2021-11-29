package view;

import java.util.ArrayList;
import java.util.List;

import controller.ListaSimplesController;

public class Principal {

	public static void main(String[] args) {
		List <Integer> l1 = new ArrayList <>();
		l1.add(3);
		l1.add(15);
		l1.add(5);
		l1.add(8);
		
		List <Integer> l2 = new ArrayList <> ();
		l2.add(2);
		l2.add(9);
		
		ListaSimplesController lsc = new ListaSimplesController();
		List <Integer> concatenado = lsc.concatena(l1, l2);
		System.out.println(concatenado);
		
		lsc.divideLista(l1, 2).forEach(System.out::println);
		
		List <Integer> copia = lsc.copiaLista(l1);
		System.out.println("Lista copiada: " + copia);
		
		lsc.emOrdemCrescente(l1);
		System.out.println("Em ordem crescente: " + l1);
		
		lsc.emOrdemDecrescente(l1);
		System.out.println("em ordem decrescente: " + l1);
		

	}

}
