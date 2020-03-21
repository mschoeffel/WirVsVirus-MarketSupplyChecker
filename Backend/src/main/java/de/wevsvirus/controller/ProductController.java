package de.wevsvirus.controller;

import de.wevsvirus.model.Product;
import de.wevsvirus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

  private ProductService productService;

  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping()
  public List<Product> findAll() {
    return productService.findAll();
  }

  @GetMapping("/{id}")
  public Product findById(@PathVariable Long id) {
    return productService.findById(id);
  }

  @PostMapping()
  public Product createQuantity(@RequestBody Product product) {
    return productService.createProduct(product);
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