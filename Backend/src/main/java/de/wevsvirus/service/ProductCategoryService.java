package de.wevsvirus.service;

import de.wevsvirus.model.ProductCategory;
import de.wevsvirus.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductCategoryService {

    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    public ProductCategoryService(ProductCategoryRepository productCategoryRepository){
        this.productCategoryRepository = productCategoryRepository;
    }

    public ProductCategory getProductCategoryById(Long id){
        return productCategoryRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ProductCategory getProductCategoryByName(String name){
        return productCategoryRepository.findByName(name).orElseThrow(EntityNotFoundException::new);
    }

    public List<ProductCategory> getAllProductCategories(){
        return productCategoryRepository.findAll();
    }

    @Transactional
    public ProductCategory createProductCategory(ProductCategory productCategory){
        productCategory.setId(null);
        return productCategoryRepository.save(productCategory);
    }

    @Transactional
    public ProductCategory updateProductCategory(Long id, ProductCategory productCategory){
        productCategory.setId(id);
        return productCategoryRepository.save(productCategory);
    }

    public void deleteProductCategoryById(Long id){
        productCategoryRepository.deleteById(id);
    }
}
