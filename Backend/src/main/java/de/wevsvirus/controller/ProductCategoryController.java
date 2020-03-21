package de.wevsvirus.controller;

import de.wevsvirus.model.ProductCategory;
import de.wevsvirus.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/productcategory")
public class ProductCategoryController {

    private ProductCategoryService productCategoryService;

    @Autowired
    public ProductCategoryController(ProductCategoryService productCategoryService){
        this.productCategoryService = productCategoryService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ProductCategory getProductCategoryById(@PathVariable(name = "id") Long id){
        try{
            return productCategoryService.getProductCategoryById(id);
        } catch(EntityNotFoundException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "productcategory.notfound");
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<ProductCategory> getAllProductCategories(){
        return productCategoryService.getAllProductCategories();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ProductCategory createProductCategory(@RequestBody ProductCategory productCategory){
        return productCategoryService.createProductCategory(productCategory);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public ProductCategory updateProductCategory(@PathVariable(name = "id") Long id, @RequestBody ProductCategory productCategory){
        return productCategoryService.updateProductCategory(id, productCategory);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteProductCategory(@PathVariable(name = "id") Long id){
        productCategoryService.deleteProductCategoryById(id);
    }

}
