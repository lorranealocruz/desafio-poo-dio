package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descrição do curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição da mentoria Java");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());		
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		System.out.println("------------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluídos João: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());

	}

}
