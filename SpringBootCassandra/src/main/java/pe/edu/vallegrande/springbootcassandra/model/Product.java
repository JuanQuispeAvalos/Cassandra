package pe.edu.vallegrande.springbootcassandra.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


import java.util.UUID;

@Table("Producto")
public class Product {

	@PrimaryKey
	private UUID id;
	
	@NotBlank
    @Size(max=100)
	private String name;
	private String description;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", name=" + name + ", description=" + "]";
	}
}
