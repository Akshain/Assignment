package com.prodapt.library.controller;

import java.util.LinkedList;
import java.util.TreeSet;

import com.prodapt.library.entity.Library;
import com.prodapt.library.services.BusinessLogic;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessLogic bl = new BusinessLogic();
		LinkedList<Library> L = bl.addBooks();
		System.out.println("\n");
		bl.displayBooks(L);
		System.out.println("\n");
		bl.updateBooks(L);
		System.out.println("\n");
		bl.deleteBook(L);
	}

}
