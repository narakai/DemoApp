package com.gaussic.repository;

import com.gaussic.model.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by leon on 16/4/14.
 */
@Repository
public interface BlogRepository extends JpaRepository<BlogEntity, Integer> {

}
