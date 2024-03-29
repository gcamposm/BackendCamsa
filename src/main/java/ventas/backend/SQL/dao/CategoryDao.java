package ventas.backend.SQL.dao;

import ventas.backend.SQL.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Integer> {
    Category findByName(String name);
    Category findCategoryById(Integer id);

    List<Category> findCategoriesByDeletedFalse();

}