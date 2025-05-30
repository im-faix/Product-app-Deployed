package personal.project.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import personal.project.productapp.entity.Product;
import personal.project.productapp.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:8094")
public class ProductController 
{
	@Autowired
	private ProductService service;
	
	
	  @GetMapping("/")
	    public String index() {
	        return "index.html";
	    }
	
	@PostMapping
	public Product addProduct(@RequestBody Product product)
	{
		return service.addProduct(product);
	}
	
	@GetMapping
	public List<Product> getAllProducts()
	{
		return service.getAllProducts();
	}
	
	 @PutMapping("/{id}")
	    public Product update(@PathVariable Integer id, @RequestBody Product product) {
	        return service.update(id, product);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Integer id) {
	        service.delete(id);
	    }
}
