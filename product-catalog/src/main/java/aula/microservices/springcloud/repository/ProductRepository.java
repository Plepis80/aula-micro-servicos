package aula.microservices.springcloud.repository;

import aula.microservices.springcloud.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {



}
