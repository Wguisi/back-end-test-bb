package br.com.bb.command;

import br.com.bb.base.command.ICommandBusiness;
import br.com.bb.model.Category;
import br.com.bb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;
import java.util.List;

@Named()
public class CategoryListAllCommand implements ICommandBusiness<Void, List<Category>> {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> execute(Void aVoid) {

        return (List) this.categoryRepository.findAll();

    }
}
