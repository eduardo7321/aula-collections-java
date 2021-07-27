package com.estudo.collections.java.estudocollectionsjava;

import org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.*;

@SpringBootApplication
public class EstudoCollectionsJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoCollectionsJavaApplication.class, args);

		//ESTUDO DO SET
//		System.out.println("Crie uma lista e adicione as sete notas: ");
//		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
//		System.out.println(notas.toString());
//
////		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
////
////		System.out.println("Adicione na lista a nota 8.0 na posição 4: " + notas.indexOf(5d));
////
////		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
////
//		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
////
////		System.out.println("Exiba todas as notas na ordem que foram informadas: ");
////
////		System.out.println("Exiba terceira nota que foi informada: " + notas.get(2));
////
//		System.out.println("Exiba a menor nota: " + Collections.min(notas));
////
//		System.out.println("Exiba a maior nota: " + Collections.max(notas));
////
//		Iterator<Double> iterator = notas.iterator();
//		Double soma = 0.0;
//		while (iterator.hasNext()) {
//			Double next = iterator.next();
//			soma+= next;
//		}
//		System.out.println("Exiba a soma dos valores: " + soma);
//
////
//		System.out.println("Exiba a média das notas: " + soma/ notas.size());
////
//		System.out.println("Remova a nota 0: ");
//		notas.remove(0d);
//		System.out.println(notas);
////
////		System.out.println("Remova a primeira nota: ");
////
//		System.out.println("Remova as notas menores que 7: ");
//		Iterator<Double> iterator1 = notas.iterator();
//		while (iterator.hasNext()){
//			Double next = iterator.next();
//			if (next < 7) iterator.remove();;
//		}
//		System.out.println(notas);
//
//		System.out.println("Exiba todas as notas na ordem que foram informadas: ");
//		Set<Double> notas2 = new LinkedHashSet<>();
//		notas2.add(7d);
//		notas2.add(8.5);
//		notas2.add(9.3);
//		notas2.add(5d);
//		notas2.add(7d);
//		notas2.add(0d);
//		notas2.add(3.6);
//		System.out.println(notas2);
////
//		System.out.println("Exiba todas as notas naordem crescente: ");
//		Set<Double> notas3 = new TreeSet<>(notas2);
//		System.out.println(notas3);
//
//		System.out.println("Apague todo o conjunto:");
//		notas.clear();
//
//		System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
//		System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
//
//
//		System.out.println("--\tOrdem aleatória\t--");
//		Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
//			add(new Serie("got", "fantasia", 60));
//			add(new Serie("dark", "drama", 60));
//			add(new Serie("that '70s show", "comédia", 25));
//		}};
//		for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
//			+ serie.getGenero() + " - " + serie.getTempoEpisodio());
//
//		System.out.println("--\tOrdem natural (TempoEpisodio\t--");
//		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
//		for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + "-"
//				+ serie.getGenero() + "-" + serie.getTempoEpisodio());
//
//		System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
//		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
//		minhasSeries3.addAll(minhasSeries1);
//		for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + "-"
//				+ serie.getGenero() + "-" + serie.getTempoEpisodio());





		//ESTUDO DO MAP
		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos ");
		Map<String, Double> carrosPopulares = new HashMap<>(){{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kuid", 15.6);
		}};
		System.out.println(carrosPopulares.toString());

		System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
		carrosPopulares.put("gol", 16.1);
		System.out.println(carrosPopulares);

		System.out.println("Confira se o tucson está no dicionário: " + carrosPopulares.containsKey("tuscon"));

		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

		//System.out.println("Exiba o terceiro modelo adicionado: ");

		System.out.println("exiba os modelos: ");
		Set<String> modelos =	carrosPopulares.keySet();
		System.out.println(modelos);

		System.out.println("Exiba os consumos dos carros: ");
		Collection<Double> consumos = carrosPopulares.values();
		System.out.println(consumos);

		System.out.println("Exiba o modelo mais economico e seu consumo: ");

		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";

		for (Map.Entry<String, Double> entry: entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + "-" + consumoMaisEficiente);
			}
		}




		//		ORDENACAO HAS
//		System.out.println("Confira se a l//		ista está vazia: " + notas.isEmpty());
	//





//		List<Gato> meusGatos = new ArrayList<>(){{
//			add(new Gato("Jon", 18, "preto"));
//			add(new Gato("Simba", 6, "tigrado"));
//			add(new Gato("Jon", 12, "amarelo"));
//		}};
//
//		System.out.println("--\tOrdem de Inserção\t---");
//		System.out.println(meusGatos);
//
//		System.out.println("--\tOrdem de aleatória\t---");
//		Collections.shuffle(meusGatos);
//		System.out.println(meusGatos);
//
//		System.out.println("--\tOrdem Natural (Nome)\t---");
//		Collections.sort(meusGatos);
//		System.out.println(meusGatos);
//
//		System.out.println("--\tOrdem Idade\t---");
//		//Collections.sort(meusGatos, new ComparatorIdade());
//		meusGatos.sort(new ComparatorIdade());
//		System.out.println(meusGatos);
//
//		System.out.println("--\tOrdem Idade\t---");
//		//Collections.sort(meusGatos, new ComparatorCor());
//		meusGatos.sort(new ComparatorCor());
//		System.out.println(meusGatos);
//
//		System.out.println("--\tOrdem Nome/Cor/Idade\t---");
//		meusGatos.sort(new ComparatorNomeCorIdade());
//		System.out.println(meusGatos);



//		ESTUDO DE LISTA
//		System.out.println("Crie uma lista e adicione as sete notas: ");
//
//		List<Double> notas = new ArrayList<Double>();
//		notas.add(7.0);
//		notas.add(8.5);
//		notas.add(9.3);
//		notas.add(5.0);
//		notas.add(7.0);
//		notas.add(0.0);
//		notas.add(3.6);
//		System.out.println(notas);
//
//		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
//
//		System.out.println("Adicione na lista a nota 8.0 na posição 4: " + notas.indexOf(5d));
//		notas.add(4,8d);
//		System.out.println(notas);
//
//		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
//		notas.set(notas.indexOf(5d), 6.0);
//		System.out.println(notas);
//
//		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
//
//		System.out.println("Exiba todas as notas na ordem que foram informadas: ");
//		for (Double nota : notas) System.out.println(nota);
//
//		System.out.println("Exiba terceira nota que foi informada: " + notas.get(2));
//		System.out.println(notas.toString());
//
//		System.out.println("Exiba a menor nota: " + Collections.min(notas));
//
//		System.out.println("Exiba a maior nota: " + Collections.max(notas));
//
//		Iterator<Double> iterator = notas.iterator();
//		Double soma = 0d;
//		while (iterator.hasNext()){
//			Double next = iterator.next();
//			soma += next;
//		}
//		System.out.println("Exiba a soma dos valores: " + soma);
//
//		System.out.println("Exiba a média das notas: " + soma/ notas.size());
//
//		System.out.println("Remova a nota 0: ");
//		notas.remove(0d);
//		System.out.println(notas);
//
//		System.out.println("Remova a primeira nota: ");
//		notas.remove(0);
//		System.out.println(notas);
//
//		System.out.println("Remova as notas menores que 7: ");
//		Iterator<Double> iterator1 = notas.iterator();
//		while (iterator1.hasNext()){
//			Double next = iterator1.next();
//			if (next < 7 ) iterator1.remove();
//		}
//		System.out.println(notas);
//
//		System.out.println("Apague toda lista: ");
//		notas.clear();
//		System.out.println(notas);
//
//		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

		//Ordenação de elementos em uma coleção List



	}

}

class Gato implements Comparable<Gato> {
	private String nome;
	private Integer idade;
	private  String cor;

	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				", cor='" + cor + '\'' +
				'}';
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}

}

class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}

class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome != 0 ) return nome;

		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor != 0) return cor;

		return Integer.compare(g1.getIdade(), g2.getIdade());

	}
}

class Serie implements Comparable<Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;

	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie{" +
				"nome='" + nome + '\'' +
				", genero='" + genero + '\'' +
				", tempoEpisodio=" + tempoEpisodio +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Serie serie = (Serie) o;
		return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
	}



	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, tempoEpisodio);
	}

	@Override
	public int compareTo(Serie serie) {

		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0) return tempoEpisodio;

		int genero = this.getGenero().compareTo(serie.getGenero());
		return (genero);
		//return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
	}

}
class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie> {
	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if (nome != 0) return nome;

		int genero = s1.getGenero().compareTo(s2.getGenero());
		if (genero != 0) return genero;

		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

	}

}

