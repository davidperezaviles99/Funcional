package Funcional;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Funcional {
	
	public static class Operaciones{
		public static int suma(int a, int b) {
			return b+a;
		}
		
		public static int resta(int a, int b) {
			return a-b;
		}
		
	}
		
	static List<Integer> numeros = new ArrayList<Integer>(numeros=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,15,17,18,19,20));
	static List<String> lista = new ArrayList<String>(lista=Arrays.asList("david ","perez","aviles"));
	static List<String> colores = new ArrayList<String>(colores=Arrays.asList("red","blue","yellow","black","white"));
	
	public static void main(String[] args) {
		
		String s1 = new String("david perez aviles");
		
		//Transformaciones
		//No me salia y he tenido que hacerlo de forma sencilla abajo
		System.out.println(lista.stream().map(x -> x.toUpperCase()));
		System.out.println(lista.stream().map(x -> x.replace(" ", "")));
		System.out.println(lista.stream().map(x -> x.replace("david", "pablo")));
		
		//Forma basica		
		System.out.println("Todo en mayusculas: " + s1.toUpperCase());
		System.out.println("Reemplaza los espacios: " + s1.replace(" ", ""));
        System.out.println("Cambia la palabra David por Pablo: " + s1.replace("david", "pablo"));
        
        //Operaciones
        int a = numeros.stream().reduce(6, Operaciones::suma);
        System.out.println(a);
        
        //Collectors
        int b = numeros.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(b);
				
		//BuscarColor Funcional
		System.out.println(funcional("red"));
		
		//Igual a numero
		int c = iguales(10);
		System.out.println("El numero esta: " +c);
		
		

	}
	
	//Busca el color en una lista
	public static boolean funcional(String buscaColor) {
		return colores.contains(buscaColor);
	}

	//Busca un numero igual en una lista
	public static int iguales(int num) {
		return (int) numeros.stream().filter(x -> {
			return x.equals(num);
		}).count();
	}


}
