package com.sip.ams.repositories;

import com.sip.ams.entities.Article;
import com.sip.ams.entities.Provider;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
