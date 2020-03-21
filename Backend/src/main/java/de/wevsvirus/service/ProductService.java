package de.wevsvirus.service;

import de.wevsvirus.model.Product;
import de.wevsvirus.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {

  private ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> findAll() {
    return productRepository.findAll();
  }

  public Product findById(Long id) {
    return productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
  }

  @Transactional
  public Product createProduct(Product product) {
    return productRepository.save(product);
  }

  @Transactional
  public Product updateProduct(Product newProduct, Long id) {
    return productRepository.findById(id)
            .map(product -> {
              product.setName(newProduct.getName());
              product.setProductCategoryId(newProduct.getProductCategoryId());
              return productRepository.save(product);
            }).orElseGet(() -> {
              newProduct.setId(id);
              return productRepository.save(newProduct);
            });
  }

  @Transactional
  public void deleteById(Long id) {
    productRepository.deleteById(id);
  }
}
