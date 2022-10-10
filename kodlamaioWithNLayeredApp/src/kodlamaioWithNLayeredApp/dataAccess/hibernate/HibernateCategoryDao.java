package kodlamaioWithNLayeredApp.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaioWithNLayeredApp.dataAccess.CategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	
	List<Category> categories;
	
	public HibernateCategoryDao() {
		categories=new ArrayList<Category>();
	}

	@Override
	public void add(Category category) {
		categories.add(category);
		System.out.println("Kategori bilgileri hibernate ile veritabanýna eklendi");
	}
	@Override
	public List<Category> getAll() {
		return categories;
	}
}
