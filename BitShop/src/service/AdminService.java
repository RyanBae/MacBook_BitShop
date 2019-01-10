package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
	//private String adminNum, name, pass, auth;
		/**
		 * CREATE
		 * */
		public void createAdmins(String adminNum, String name, String pass, String auth);
		
		/**
		 * READ
		 * */
		public ArrayList<AdminBean> findAdminsBylist();
		public ArrayList<AdminBean> findAdminByName(String name);
		public AdminBean findByAdminNum(String adminNum);
		public boolean existAdmin(String adminNum, String pass);
		public String adminsCount();
		/**
		 * UPDATE
		 * */
		public void changePass(String adminNum, String pass, String newpass);
		/**
		 * DELETE
		 * */
		public void removeMember(String adminNum, String pass);
}
