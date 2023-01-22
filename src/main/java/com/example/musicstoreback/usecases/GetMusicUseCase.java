package com.example.musicstoreback.usecases;

import com.example.musicstoreback.domain.entities.Music;
import com.example.musicstoreback.frameworks.IMusicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetMusicUseCase {

    @Autowired
    private IMusicDao musicDao;

    public List<Music> execute() {
        return musicDao.findAll();
    }
}
