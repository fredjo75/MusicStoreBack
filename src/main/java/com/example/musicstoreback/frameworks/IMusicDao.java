package com.example.musicstoreback.frameworks;

import com.example.musicstoreback.domain.entities.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("musicDao")
public interface IMusicDao extends JpaRepository<Music, Long> {
}
