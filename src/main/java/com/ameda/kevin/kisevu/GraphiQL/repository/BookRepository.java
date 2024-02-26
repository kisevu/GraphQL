package com.ameda.kevin.kisevu.GraphiQL.repository;/*
*
@author ameda
@project GraphiQL
@package com.ameda.kevin.kisevu.GraphiQL.repository
*
*/

import com.ameda.kevin.kisevu.GraphiQL.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
