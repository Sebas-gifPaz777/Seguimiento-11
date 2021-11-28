package ui;

import model.Curso;
import model.Students;

public class Main {
	private Curso course;
	
	public Main(){
		course= new Curso();
	}
	
	public static void main(String[]args) {
		Main main=new Main();
		main.start();
		main.print();
		System.out.println("-------------------");
		main.delete();
		main.print();
	}
	
	public void start() {
		
		Students c1=new Students(1,"Jorge");
		Students c2=new Students(4,"Andrés");
		Students c3=new Students(7,"Julio");
		Students c4=new Students(8,"Juliana");
		Students c5=new Students(34,"Camilo");
		Students c6=new Students(5,"Sofía");
		
		
		course.addStudent(c1);
		course.addStudent(c2);
		course.addStudent(c3);
		course.addStudent(c4);
		course.addStudent(c5);
		course.addStudent(c6);
		
		
	}
	
	public void delete() {
		int el=course.eliminateStudent("Juliana");
		System.out.println(el);
	}
	
	public void print() {
		course.paintGeneral();
		
	}
}
