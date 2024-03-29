package ventas.backend.SQL.dao;

import ventas.backend.SQL.models.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeDao extends JpaRepository<Type, Integer> {
    Type findByType(String type);

    Type findTypeById(Integer id);
}
