package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDao {

//	public String id, name, pass, ssn;
	/**
	 * CREATE
	 * */
	public void insertMember(MemberBean member);
		
	
	/**
	 * READ
	 * */
	public ArrayList<MemberBean> selectMembersByList();
	public ArrayList<MemberBean> selectMembersByName(String name);
	public MemberBean selectMemberById(String id);
	public int countMembers();
	public boolean existMember(String id, String pass);
	/**
	 * UPDATE
	 * */
	public void updatePass(String id, String pass, String newpass);
	/**
	 * DELETE
	 * */
	public void deleteContent(String id, String pass);
}
