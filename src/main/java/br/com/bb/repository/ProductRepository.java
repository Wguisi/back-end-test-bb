package br.com.bb.repository;

import br.com.bb.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query("from Product where category_id = :categoryId")
    List<Product> findAllByCategory(@Param("categoryId") Integer categoryId);

}
