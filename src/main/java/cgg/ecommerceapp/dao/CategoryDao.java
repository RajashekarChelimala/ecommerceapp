package cgg.ecommerceapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cgg.ecommerceapp.entities.Category;
import cgg.ecommerceapp.helpers.Connection;

public class CategoryDao {

	public static boolean addCategory(String categoryName, String categoryDescription) {
		boolean f;
		try(Session session = Connection.getSession()){
			Transaction tx = session.beginTransaction();
			Category cat= new Category(categoryName,categoryDescription);
			session.save(cat);
			tx.commit();
			f=true;
		}
		catch(Exception e) {
			f=false;
			e.printStackTrace();
		}
		return f;
	}
	
	public static List<Category> getAllCategories() {
		boolean f;
		try(Session session = Connection.getSession()){
			String hql = "FROM Categories WHERE userEmail = :email AND userPassword = :password";
			f=true;
		}
		catch(Exception e) {
			f=false;
			e.printStackTrace();
		}
		return null;
	}
	
}
