package cgg.ecommerceapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import cgg.ecommerceapp.entities.Users;
import cgg.ecommerceapp.helpers.Connection;

public class UserDao {
	public static boolean addUser(String userName, String userEmail, String userPassword, String userPhone,
			String userAddress) {
		boolean f = false;
		try (Session session = Connection.getSession()) {
			Transaction tx = session.beginTransaction();
			Users users = new Users(userName, userEmail, userPassword, userPhone, userAddress, "normal");
			session.save(users);
			tx.commit();
			f = true;
		} catch (Exception e) {
			f = false;
			e.printStackTrace();
		}
		return f;
	}

	public static Users getUser(String userEmail, String userPassword) {
		Users user = null;
		try (Session session = Connection.getSession()) {
			String hql = "FROM Users WHERE userEmail = :email AND userPassword = :password";
			Query<Users> query = session.createQuery(hql);
			query.setParameter("email", userEmail);
			query.setParameter("password", userPassword);
			user = query.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public static Users getCurrentUser(String userName) {
		Users user = null;
		try (Session session = Connection.getSession()) {
			String hql = "FROM Users WHERE userName = :userName";
			Query<Users> query = session.createQuery(hql);
			query.setParameter("userName", userName);
			user = query.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public static List<Users> getAllUsers() {
		try (Session session = Connection.getSession()) {
			String hql = "FROM Users";
			Query<Users> query = session.createQuery(hql,Users.class);
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
