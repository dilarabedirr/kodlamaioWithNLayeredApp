package kodlamaioWithNLayeredApp.business;

import java.util.List;

import kodlamaioWithNLayeredApp.dataAccess.CategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;

	public CategoryManager(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	public void add(Category category) {
		var categories = categoryDao.getAll();
		for (Category c : categories) {
			if (category.getName() == c.getName()) {
				System.out.println("Kategori ismi tekrar edemez : " + category.getName());
				return;
			}
		}
		System.out.println("Kategori eklendi : " + category.getName());
		categoryDao.add(category);
	}

	public List<Category> getAll() {
		System.out.println("Kategoriler listelendi : ");
		var categories = categoryDao.getAll();
		for (Category category : categories) {
			System.out.println(category.getName());
		}
		return categories;
	}
}
