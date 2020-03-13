package pe.edu.vallegrande.springbootcassandra.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;


import pe.edu.vallegrande.springbootcassandra.model.Product;

import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {

}
