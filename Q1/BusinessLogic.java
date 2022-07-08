package com.prodapt.CodeBasedAssignment;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class BusinessLogic {
	
	void insertItem() {
		Session session = Helper.setUp();
		ElectronicShop e1 = new ElectronicShop(1, "Laptop", 80000);
		ElectronicShop e2 = new ElectronicShop(2, "mobile", 30000);
		ElectronicShop e3 = new ElectronicShop(3, "Ear Pods", 15000);
		ElectronicShop e4 = new ElectronicShop(4, "Monitor", 25000);
		ElectronicShop e5 = new ElectronicShop(5, "Keyboards", 1500);
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(e4);
        session.save(e5);
        session.close();
	}
	public void updateItems() {
		Session session = Helper.setUp();
        Transaction t = session.beginTransaction();
        Query q=session.createQuery("update ElectronicShop set name=:nn where id=:oo");
        q.setParameter("nn","Head Phones");     //record 10
        q.setParameter("oo",3);

        int status=q.executeUpdate();
        System.out.println(status);
        t.commit();
        session.close();
	}
	public void deleteItems() {
		Session session = Helper.setUp();
        Transaction t = session.beginTransaction();
        Query q=session.createQuery("delete from ElectronicShop where id=4");
        int status=q.executeUpdate();
        System.out.println(status);
        t.commit();
        session.close();
	}
	public void displayItems() {
		Session session = Helper.setUp();
		System.out.println("Display all Items available");
        Query query=session.createQuery("from ElectronicShop");//here persistent class name is Emp  
        List<ElectronicShop> list=(List<ElectronicShop>) query.list();
        for (ElectronicShop object : list) {
			System.out.println(object);
		}
        session.close();
	}

}
