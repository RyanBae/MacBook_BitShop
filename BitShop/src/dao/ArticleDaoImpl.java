package dao;

import java.util.ArrayList;

import domain.ArticleBean;

public class ArticleDaoImpl implements ArticleDao{
	private static ArticleDaoImpl instance = new ArticleDaoImpl();
	public ArticleDaoImpl() {}
	public static ArticleDaoImpl getInstance() {return instance;}

	
	@Override
	public void insertArticles(String seq, String title, String content, String writer, String regdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ArticleBean> selectArticlesBylist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArticleBean> selectArticlesByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean selectArticleByWriter(String writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existArticleCheck(String title, String writer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String articleCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeContent(String title, String writer, String newcontent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeContent(String seq, String writer) {
		// TODO Auto-generated method stub
		
	}

}
