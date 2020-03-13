package pe.edu.vallegrande.springbootcassandra.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.vallegrande.springbootcassandra.model.Product;
import pe.edu.vallegrande.springbootcassandra.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProduct(){
		return ResponseEntity.ok().body(productService.getAllProduct());
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable UUID id){
		return ResponseEntity.ok().body(productService.getProductById(id));
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		return ResponseEntity.ok().body(this.productService.createProduct(product));
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable UUID id, @RequestBody Product product){
		product.setId(id);
		return ResponseEntity.ok().body(this.productService.updateProduct(product));
	}

	@DeleteMapping("/products/{id}")
	public HttpStatus deleteProduct(@PathVariable UUID id){
		this.productService.deleteProduct(id);
		return HttpStatus.OK;
	}
}
