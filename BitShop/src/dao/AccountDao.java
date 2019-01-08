package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDao {

	public void insertAccountNum(int money); //신규생성
	public String AccNum(); //계좌번호
	
	public ArrayList<AccountBean> selectByAll(); //계좌 금액 확인
	public AccountBean selectByAccountNum(String accountNum); //계좌 금액 확인
	public String findDate();//날짜
	public int countAccount();
	public boolean existAccountNum(String accountNum);
	
	public void withdrawMoney(String accountNum,int money); //출금
	public void depositMoney(String accountNum,int money); //입금
	
	public void deleteAccountNum(String accountNum);
}
