package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {
	//private String seq, title, content, writer, regdate;
		/**
		 * CREATE
		 * */
		public void createArticles(String seq, String title, String content, String writer, String regdate);
		
		/**
		 * READ
		 * */
		public ArrayList<ArticleBean> findArticlesBylist();
		public ArrayList<ArticleBean> findArticlesByTitle(String title);
		public ArticleBean findArticleByWriter(String writer);
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
