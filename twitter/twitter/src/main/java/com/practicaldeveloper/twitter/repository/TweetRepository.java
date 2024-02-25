package com.practicaldeveloper.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practicaldeveloper.twitter.model.Tweet;
@Repository
public interface TweetRepository extends JpaRepository<Tweet,Integer>{
    
}
