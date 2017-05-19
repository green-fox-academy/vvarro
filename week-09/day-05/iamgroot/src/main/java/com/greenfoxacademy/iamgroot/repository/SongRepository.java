package com.greenfoxacademy.iamgroot.repository;

import com.greenfoxacademy.iamgroot.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface SongRepository extends CrudRepository<Song, Long> {
  Iterable<Song> findAllByGenreContains(String genre);
  Iterable<Song> findAllByAuthorContains(String author);
  Iterable<Song> findAllByYearIsContaining(String year);
  Iterable<Song> findFirstByOrderByRatingDesc();
  Iterable<Song> findFirst3ByOrderByRatingDesc();
  Iterable<Song> findFirst5ByOrderByRatingDesc();
}
