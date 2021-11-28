package model;

public class Curso {
	
	private Students lastStudent;
	private Students firstStudent;
	private Students root;
	private Students newSt;

	
	public Curso() {
		this.lastStudent =null;
		this.firstStudent = null;
		this.root = null;
	}

	public int eliminateStudent(String nameE) {
		Students aux=root;
		boolean checked=false;
		
		if(root.getName().equalsIgnoreCase(nameE)) {
			root=root.getNext();
			firstStudent=root;
			lastStudent.setNext(root);
			root.setPrev(lastStudent);
			checked=true;
		}
		else {
			aux=aux.getNext();
			while(aux!=root) {
				if(aux.getName().equalsIgnoreCase(nameE)) {
					aux.getPrev().setNext(aux.getNext());
					aux.getNext().setPrev(aux.getPrev());
					if(aux==lastStudent)
						lastStudent=aux.getPrev();
				}
				else {
					aux=aux.getNext();
				}
			}
		}
		if(aux==root && !checked) {
			return 0;
		}
		else {
			return aux.getCode();
		}
			
	}
	
	public void addStudent(Students newSt) {
		
		if(root==null) {
			root=newSt;
			lastStudent=newSt;
			firstStudent=newSt;
			newSt.setNext(newSt);
			newSt.setPrev(newSt);
		}
		else {
			if(root.getNext()==firstStudent) {
				root.setNext(newSt);
				root.setPrev(newSt);
				lastStudent=newSt;
				newSt.setNext(firstStudent);
				newSt.setPrev(firstStudent);
			}
			else {
				Students aux=root;
				while(aux.getNext()!=firstStudent) {
					aux=aux.getNext();
				}
				aux.setNext(newSt);
				aux.getNext().setPrev(aux);
				aux.getNext().setNext(firstStudent);
				lastStudent=aux.getNext();
				root.setPrev(lastStudent);
			}
		}
	}
	
	public void paintGeneral() {
		Students aux=root;
		
		do{
			System.out.println(aux.getName());
			aux=aux.getNext();
		}while(aux!=lastStudent);
		System.out.println(aux.getName());
	}

}
