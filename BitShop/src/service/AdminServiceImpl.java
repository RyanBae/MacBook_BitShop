package service;

import java.util.ArrayList;

public class AdminServiceImpl implements AdminService{

	@Override
	public void createAdmins(String adminNum, String name, String pass, String auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList[] list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList[] findByAdminNum(String adminNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existLogin(String adminNum, String pass) {
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
