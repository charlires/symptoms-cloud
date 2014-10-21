package com.charlires.symptoms.repository;

import com.charlires.symptoms.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by carlos_andonaegui on 10/20/14.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface DoctorRepository extends MongoRepository<Doctor, String> {
}
