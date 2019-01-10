package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
//	public String id, name, pass, ssn;
	/**
	 * CREATE
	 * */
	public void creatMember(MemberBean member);
		
	
	/**
	 * READ
	 * */
	public ArrayList<MemberBean> findMembersByList();
	public ArrayList<MemberBean> findMembersByName(String name);
	public MemberBean findMemberById(String id);
	public int countMembers();
	public boolean existMember(String id, String pass);
	/**
	 * UPDATE
	 * */
	public void changePass(String id, String pass, String newpass);
	/**
	 * DELETE
	 * */
	public void removeContent(String id, String pass);
}
