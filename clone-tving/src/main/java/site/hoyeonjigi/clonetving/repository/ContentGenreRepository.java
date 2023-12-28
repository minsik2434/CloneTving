package site.hoyeonjigi.clonetving.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import site.hoyeonjigi.clonetving.domain.ContentEntity;
import site.hoyeonjigi.clonetving.domain.ContentGenreEntity;

@Repository
public interface ContentGenreRepository extends JpaRepository<ContentGenreEntity,ContentEntity> {
    
}
