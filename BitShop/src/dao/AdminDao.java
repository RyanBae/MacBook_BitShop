package dao;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminDao {
	//private String adminNum, name, pass, auth;
	/**
	 * CREATE
	 * */
	public void insertAdmins(String adminNum, String name, String pass, String auth);
	
	/**
	 * READ
	 * */
	public ArrayList<AdminBean> selectAdminsBylist();
	public ArrayList<AdminBean> selectAdminByName(String name);
	public AdminBean selectByAdminNum(String adminNum);
	public boolean existAdmin(String adminNum, String pass);
	public String adminsCount();
	/**
	 * UPDATE
	 * */
	public void updatePass(String adminNum, String pass, String newpass);
	/**
	 * DELETE
	 * */
	public void deleteMember(String adminNum, String pass);
}
