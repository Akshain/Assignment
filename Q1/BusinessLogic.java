package com.prodapt.library.services;

import java.util.LinkedList;
import java.util.TreeSet;

import com.prodapt.library.entity.Library;

public class BusinessLogic {

	public LinkedList<Library>addBooks() {
		
			Library e1=new Library(101, "Computer Networks","AKSHAI");
			Library e2=new Library(102, "FDLC","RAJ Kumar");
			Library e3=new Library(103, "ECECTRONICS","Jack Sparrow");
			Library e4=new Library(104, "HTML","Prudhvi");

			LinkedList<Library>LibarayBucket=new LinkedList<Library>();
			LibarayBucket.add(e1);
			LibarayBucket.add(e2);
			LibarayBucket.add(e3);
			LibarayBucket.add(e4);
			System.out.println("Added Successfully");
			return LibarayBucket;
	}
	public void displayBooks(LinkedList<Library> s) {
		System.out.println("List of Library Books : ");
		for (Library library : s) {
			System.out.println(library);
		}
	}
	public void updateBooks(LinkedList<Library> s) {
		System.out.println("Updation is done here : ");
		for (Library ie : s) {
			int id=ie.getId();
			if(id==103) {
				ie.setName("Python");
			}
			System.out.println(ie);
		}	
	}
	public void deleteBook(LinkedList<Library> l) {
		System.out.println("Deletion is done here : ");
		for (Library L : l) {
			String name=L.getName();
			if(name=="HTML") {
				l.remove(L);
			}
			System.out.println(L);
		}
		
	}
}
