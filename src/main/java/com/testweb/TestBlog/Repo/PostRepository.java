package com.testweb.TestBlog.Repo;

import com.testweb.TestBlog.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {

}
