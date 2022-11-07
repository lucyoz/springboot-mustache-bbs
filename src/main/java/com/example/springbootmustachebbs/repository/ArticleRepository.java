package com.example.springbootmustachebbs.repository;

import com.example.springbootmustachebbs.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
