package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AccountBean;

public class AccountDaoImpl implements AccountDao{

	private static AccountDaoImpl instance = new AccountDaoImpl();
	private AccountDaoImpl() {}
	public static AccountDaoImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;


	@Override
	public void insertAccountNum(int money) {

	}

	@Override
	public String AccNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AccountBean> selectByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean selectByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void withdrawMoney(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositMoney(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}

}
