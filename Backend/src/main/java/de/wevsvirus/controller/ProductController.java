package de.wevsvirus.controller;

import de.wevsvirus.model.Product;
import de.wevsvirus.model.SearchObject;
import de.wevsvirus.service.ProductCategoryService;
import de.wevsvirus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

  private ProductService productService;
  private ProductCategoryService productCategoryService;

  @Autowired
  public ProductController(ProductService productService, ProductCategoryService productCategoryService) {
    this.productService = productService;
    this.productCategoryService = productCategoryService;
  }

  @GetMapping()
  public List<Product> findAll() {
    return productService.findAll();
  }

  @GetMapping("/{id}")
  public Product findById(@PathVariable Long id) {
    return productService.findById(id);
  }

  @GetMapping("/category/{data}")
  public List<Product> findByCategory(@PathVariable String data) {
    try {
      return productCategoryService.getProductCategoryByName(data).getProducts();
    } catch(EntityNotFoundException e){
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "productcategory.notfound");
    }
  }

  @PostMapping()
  public Product createProduct(@RequestBody Product product) {
    return productService.createProduct(product);
  }

  @PostMapping("/multiple")
  public List<Product> createMultipleProduct(@RequestBody List<Product> products) {
    List<Product> result = new ArrayList<>();
    for(Product product : products) {
      result.add(productService.createProduct(product));
    }
    return result;
  }

  @PutMapping("/{id}")
  public Product updateProduct(@RequestBody Product product, @PathVariable Long id) {
    return productService.updateProduct(product, id);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    productService.deleteById(id);
  }
}
