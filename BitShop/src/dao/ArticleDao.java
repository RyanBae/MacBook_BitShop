package dao;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleDao {
	//private String seq, title, content, writer, regdate;
	/**
	 * CREATE
	 * */
	public void insertArticles(String seq, String title, String content, String writer, String regdate);
	
	/**
	 * READ
	 * */
	public ArrayList<ArticleBean> selectArticlesBylist();
	public ArrayList<ArticleBean> selectArticlesByTitle(String title);
	public ArticleBean selectArticleByWriter(String writer);
	public boolean existArticleCheck(String title, String writer);
	public String articleCount();
	/**
	 * UPDATE
	 * */
	public void changeContent(String title, String writer, String newcontent);
	/**
	 * DELETE
	 * */
	public void removeContent(String seq, String writer);
}

