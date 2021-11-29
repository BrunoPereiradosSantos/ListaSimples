package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListaSimplesController {
	public List concatena(List <Integer> l1, List <Integer> l2) {
		List <Integer> concatenaLista = new ArrayList<Integer> (l1);
		concatenaLista.addAll(l2);
		return concatenaLista;
		
	}
	
	
	public static <T> Stream<List<T>> divideLista(List<T> lista, int comprimento) {
	    if (comprimento <= 0)
	        throw new IllegalArgumentException("tamanho = " + comprimento);
	    int tamanho = lista.size();
	    if (tamanho <= 0)
	        return Stream.empty();
	    int fracoes = (tamanho - 1) / comprimento;
	    return IntStream.range(0, fracoes + 1).mapToObj(
	        n -> lista.subList(n * comprimento, n == fracoes ? tamanho : (n + 1) * comprimento));
	}
	
	public List copiaLista(List <Integer> l1) {
		 List <Integer> novaLista = new ArrayList <Integer> (l1);
		 return novaLista;
	}
	
	public void emOrdemCrescente(List <Integer> l1) {
		Collections.sort(l1);	
	}
	
	public void emOrdemDecrescente(List <Integer> l1) {
		Collections.reverse(l1);
		
		
	}	
}
