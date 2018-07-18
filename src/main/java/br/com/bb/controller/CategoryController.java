package br.com.bb.controller;

import br.com.bb.base.rest.BaseRestService;
import br.com.bb.command.CategoryListAllCommand;
import br.com.bb.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = BaseRestService.PATH_CATEGORY)
public class CategoryController {

    @Autowired
    private CategoryListAllCommand categoryListAllCommand;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path= BaseRestService.PATH_CATEGORY_LIST_ALL, produces="application/json")
    public List<Category> listAll() {

        return this.categoryListAllCommand.execute(null);
    }

}
