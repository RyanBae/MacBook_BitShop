package service;

import java.util.ArrayList;

import domain.AdminBean;

public class AdminServiceImpl implements AdminService{
	private static AdminServiceImpl instance = new AdminServiceImpl();
	public AdminServiceImpl() {}
	public static AdminServiceImpl getInstance() {return instance;}

	@Override
	public void createAdmins(String adminNum, String name, String pass, String auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AdminBean> findAdminsBylist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AdminBean> findAdminByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminBean findByAdminNum(String adminNum) {
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
	public void changePass(String adminNum, String pass, String newpass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMember(String adminNum, String pass) {
		// TODO Auto-generated method stub
		
	}

}
