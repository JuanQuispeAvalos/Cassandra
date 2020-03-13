package pe.edu.vallegrande.springbootcassandra.service;

import java.util.List;
import java.util.UUID;

import pe.edu.vallegrande.springbootcassandra.model.Product;

public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(UUID productId);

	void deleteProduct(UUID id);
}
