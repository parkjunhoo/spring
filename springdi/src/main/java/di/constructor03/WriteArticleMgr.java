package di.constructor03;

public class WriteArticleMgr implements IWriteArticleMgr{

	private IArticleDAO dao;
	
	public WriteArticleMgr(IArticleDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void write(ArticleDTO article) {
			dao.insert(article);
	}
	
}
