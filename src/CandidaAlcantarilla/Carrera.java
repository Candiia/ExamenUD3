package CandidaAlcantarilla;

import java.util.Arrays;

public class Carrera {
	
	private Corredor listaCorredores[];
	private double distancia;
	private int numCorredores;
 
	public Carrera(Corredor[] listaCorredores, double distancia, int numCorredores) {
		
		this.listaCorredores = listaCorredores;
		this.distancia = distancia;
		this.numCorredores = numCorredores;
	}
 
	public Corredor[] getListaCorredores() {
		return listaCorredores;
	}
 
	public void setListaCorredores(Corredor[] listaCorredores) {
		this.listaCorredores = listaCorredores;
	}
 
	public double getDistancia() {
		return distancia;
	}
 
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
 
	@Override
	public String toString() {
		return "Carrera [listaCorredores=" + Arrays.toString(listaCorredores) + ", distancia=" + distancia + "]";
	}
	
	
	//agregar corredor
	public void agregarCorredor(Corredor c, int posicion) {
		listaCorredores[posicion]=c;
		numCorredores++;
	}
	
	
	//mostrar la lista
	public void mostrarLista(Corredor lista[]) {
		for (int i = 0; i < numCorredores; i++) {
			System.out.println(lista[i]);
		}
	}
	
	
	//Buscar por dorsal
	public Corredor findPorDorsal(int dorsal) {
		int i=0;
		boolean encontrado = false;
 
		while(i<numCorredores && !encontrado) {
			if(listaCorredores[i].getDorsal()==dorsal) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if(encontrado) {
			return listaCorredores[i];
		} else {
			return null;
		}
	}
	
	//calcular el tiempo
	public double calcularTiempo(int dorsal, double factor) {
		Corredor p = findPorDorsal(dorsal);
		return p.getTiempo()/factor;
	}
	
	//buscar por sección
	public Corredor[] buscarSeccion(int seccion) {
		Corredor listaaux[]=new Corredor[numCorredores];
		for (int i = 0; i < numCorredores; i++) {
			if(listaCorredores[i].getCategoria()==seccion) {
				listaaux[i]=listaCorredores[i];
			}
			i++;
		}
		return listaaux;
	}
	
	//Calcular media
	public double calcularMedia(int dorsal) {
		Corredor p = findPorDorsal(dorsal);
				return p.getTiempo()/distancia;
	}
	
	//este buscar muestra toda la lista
	
	public void mostraListaV2(Corredor [] lista) {
		
		for (int i = 0; i < lista.length; i++) {
		
			if(lista[i]!=null) {
			
				System.out.println(lista[i]);
			}
		}
		
	}
	
	
	//editar
	public void modificarV2(int dorsal, double tiempo) {
		
		for (int i = 0; i < numCorredores; i++) {
			
			if(listaCorredores[i].getDorsal()==dorsal) {
			}
		}
	}
}
