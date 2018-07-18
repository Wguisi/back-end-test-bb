package br.com.bb.command;

import br.com.bb.base.command.ICommandBusiness;
import br.com.bb.model.Product;
import br.com.bb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;
import java.util.List;

@Named()
public class ProductListAllByCategoryCommand implements ICommandBusiness<Integer, List<Product>> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> execute(Integer categoryId) {
        return this.productRepository.findAllByCategory(categoryId);
    }
}
