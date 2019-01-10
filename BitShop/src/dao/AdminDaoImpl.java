package dao;

import java.util.ArrayList;

import domain.AdminBean;

public class AdminDaoImpl implements AdminDao{
	private static AdminDaoImpl instance = new AdminDaoImpl();
	public AdminDaoImpl() {}
	public static AdminDaoImpl getInstance() {return instance;}

	@Override
	public void insertAdmins(String adminNum, String name, String pass, String auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AdminBean> selectAdminsBylist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AdminBean> selectAdminByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminBean selectByAdminNum(String adminNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existAdmin(String adminNum, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String adminsCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePass(String adminNum, String pass, String newpass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(String adminNum, String pass) {
		// TODO Auto-generated method stub
		
	}

}
