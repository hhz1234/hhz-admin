package com.hhz.demo.dao.mongo;

import com.hhz.demo.entity.Dept;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeptRepository extends MongoRepository<Dept,Long>{


}
