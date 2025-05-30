package personal.project.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import personal.project.productapp.entity.Product;
import personal.project.productapp.repository.ProductRepository;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product)
	{
		return productRepository.save(product);
	}
	
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}
	

	public Product update(int id, Product updatedProduct) 
	{
	    return productRepository.findById(id).map(product ->
	    {
	        product.setName(updatedProduct.getName());
	        product.setPrice(updatedProduct.getPrice());
	        product.setQuantity(updatedProduct.getQuantity());
	        return productRepository.save(product);
	    }).orElseThrow(() -> new RuntimeException("Product not found"));
	}


	    public void delete(Integer id) {
	        productRepository.deleteById(id);
	    }
}
