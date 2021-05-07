package com.how2java.projectname.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.how2java.projectname.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
