package kodlamaioWithNLayeredApp.dataAccess.jdbc;

import java.util.ArrayList;
import java.util.List;

import kodlamaioWithNLayeredApp.dataAccess.CategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	
	List<Category> categories;
	
	public JdbcCategoryDao() {
		categories=new ArrayList<Category>();
	}

	@Override
	public void add(Category category) {
		System.out.println("Kategori bilgileri jdbc ile veritabanýna eklendi");
		categories.add(category);
	}

	@Override
	public List<Category> getAll() {
		System.out.println("Kategoriler jdbc ile listelendi.");
		return categories;
	}
}
