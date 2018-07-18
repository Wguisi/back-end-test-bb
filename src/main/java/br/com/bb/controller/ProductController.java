package br.com.bb.controller;

import br.com.bb.base.rest.BaseRestService;
import br.com.bb.command.ProductListAllByCategoryCommand;
import br.com.bb.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = BaseRestService.PATH_PRODUCT)
public class ProductController {

    @Autowired
    private ProductListAllByCategoryCommand productListAllByCategoryCommand;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = BaseRestService.PATH_PRODUCT_LIST_BY_CATEGORY + "/{categoryId}")
    public List<Product> listByCategory(@PathVariable Integer categoryId) {
        return this.productListAllByCategoryCommand.execute(categoryId);
    }

    //Erro: pode vir um ID com string

}
