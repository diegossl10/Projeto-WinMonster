package br.uefs.ecomp.winmonster.util;

import java.io.Serializable;

/**
 * Classe que representa os n�s da �rvore de Huffman
 * @author Victor
 * @author Diego
 *
 */
@SuppressWarnings("serial")
public class No implements Comparable<Object>, Serializable { // Isso � feito para poder escrever os objetos no arquivo
	
	private int frequencia;
	private char simbolo;
	private No filhoDaEsquerda;
	private No filhoDaDireita;
	
	public No(){
		frequencia = 1;
	}
	
	public No(No filhoDaEsquerda, No filhoDaDireita){
		this.frequencia = filhoDaDireita.getFrequencia() + filhoDaEsquerda.getFrequencia();
		this.filhoDaEsquerda = filhoDaEsquerda;
		this.filhoDaDireita = filhoDaDireita;
	}

	/**
	 * @return the somaFrequencia
	 */
	public int getFrequencia() {
		return frequencia;
	}

	/**
	 * @param somaFrequencia the somaFrequencia to set
	 */
	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	/**
	 * @return the filhoDaEsquerda
	 */
	public No getFilhoDaEsquerda() {
		return filhoDaEsquerda;
	}
	

	/**
	 * @return the filhoDaDireita
	 */
	public No getFilhoDaDireita() {
		return filhoDaDireita;
	}

	/**
	 * @return the simbolo
	 */
	public char getSimbolo() {
		return simbolo;
	}

	/**
	 * @param simbolo the simbolo to set
	 */
	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public int compareTo(Object o) {
		No no = (No) o;
		if(this.frequencia > no.getFrequencia())
			return 1;
		else
			return 0;
	}

	public void setFilhoDaEsquerda(No novoNo) {
		this.filhoDaEsquerda = novoNo;
		
	}

	public void setFilhoDaDireita(No filhoDaDireita) {
		this.filhoDaDireita = filhoDaDireita;
	}

	public boolean eFolha() {
		if(this.filhoDaDireita == null && this.filhoDaEsquerda == null)
			return true;
		return false;
	}
}
