package service;

import java.util.ArrayList;

import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService{
	private static ArticleServiceImpl instance = new ArticleServiceImpl();
	private ArticleServiceImpl() {}
	public static ArticleServiceImpl getInstance() {return instance;}

	@Override
	public void createArticles(String seq, String title, String content, String writer, String regdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ArticleBean> findArticlesBylist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArticleBean> findArticlesByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean findArticleByWriter(String writer) {
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
