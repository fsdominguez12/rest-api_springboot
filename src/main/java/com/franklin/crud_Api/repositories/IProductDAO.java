package com.franklin.crud_Api.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.franklin.crud_Api.models.ProductDTO;


@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {
	
	
}
