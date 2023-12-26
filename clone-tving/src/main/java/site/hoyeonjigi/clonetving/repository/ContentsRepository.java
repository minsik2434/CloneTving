package site.hoyeonjigi.clonetving.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import site.hoyeonjigi.clonetving.domain.ContentsEntity;


@Repository
public interface ContentsRepository extends JpaRepository<ContentsEntity, String>{
    
}
