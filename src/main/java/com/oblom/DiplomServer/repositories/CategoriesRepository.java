package com.oblom.DiplomServer.repositories;

import com.oblom.DiplomServer.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

}
