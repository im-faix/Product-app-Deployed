package personal.project.productapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personal.project.productapp.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> 
{

}
