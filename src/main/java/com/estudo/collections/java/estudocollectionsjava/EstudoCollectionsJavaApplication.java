package com.estudo.collections.java.estudocollectionsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class EstudoCollectionsJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoCollectionsJavaApplication.class, args);

		System.out.println("Crie uma lista e adicione as sete notas: ");

		List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		System.out.println(notas);

		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

		System.out.println("Adicione na lista a nota 8.0 na posição 4: " + notas.indexOf(5d));
		notas.add(4,8d);
		System.out.println(notas);

		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6.0);
		System.out.println(notas);

		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

		System.out.println("Exiba todas as notas na ordem que foram informadas: ");
		for (Double nota : notas) System.out.println(nota);

		System.out.println("Exiba terceira nota que foi informada: " + notas.get(2));
		System.out.println(notas.toString());

		System.out.println("Exiba a menor nota: " + Collections.min(notas));

		System.out.println("Exiba a maior nota: " + Collections.max(notas));

		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()){
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma dos valores: " + soma);

		System.out.println("Exiba a média das notas: " + soma/ notas.size());

		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);

		System.out.println("Remova a primeira nota: ");
		notas.remove(0);
		System.out.println(notas);

		System.out.println("Remova as notas menores que 7: ");
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()){
			Double next = iterator1.next();
			if (next < 7 ) iterator1.remove();
		}
		System.out.println(notas);

		System.out.println("Apague toda lista: ");
		notas.clear();
		System.out.println(notas);

		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

	}


}
