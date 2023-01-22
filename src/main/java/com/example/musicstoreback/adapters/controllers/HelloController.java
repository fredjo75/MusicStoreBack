package com.example.musicstoreback.adapters.controllers;

import com.example.musicstoreback.domain.entities.Music;
import com.example.musicstoreback.usecases.GetMusicUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "music")

public class HelloController {

	@Autowired
	private GetMusicUseCase getMusicUseCase;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Music> getAll() {
		return getMusicUseCase.execute();
	}

}
