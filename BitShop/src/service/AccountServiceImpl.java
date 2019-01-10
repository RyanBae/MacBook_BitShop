package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService{

	private static AccountServiceImpl instance = new AccountServiceImpl();
	private AccountServiceImpl() {}
	public static AccountServiceImpl getInstance() {return instance;}
	
	@Override
	public void createAccountNum(int money) {
		
		AccountBean accountBean = new AccountBean();
		accountBean.setAccountNum(AccNum());
		accountBean.setToday(findDate());
		accountBean.setMoney(money);
		
		String accountNum = accountBean.getAccountNum();
		System.out.println("확인!!:::"+accountNum);
	}
	@Override
	public String AccNum() {
		String accNum = "";
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				accNum += random.nextInt(10) + "-";
			} else {
				accNum += random.nextInt(10);
			}
		}
		return accNum;
	}


	@Override
	public ArrayList<AccountBean> findAccountByAll() {

		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		

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
	public String findDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
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
