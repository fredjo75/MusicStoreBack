package com.example.musicstoreback.adapters.controllers;

import com.example.musicstoreback.adapters.dto.MusicDto;
import com.example.musicstoreback.business.usecases.GetMusicUseCase;
import com.example.musicstoreback.domain.entities.Music;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.Collectors;

@Controller
@RequestMapping(path = "music")

public class MusicController {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private GetMusicUseCase getMusicUseCase;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<MusicDto> getAll() {
		return getMusicUseCase.execute().stream().map(this::convertToDto).collect(Collectors.toList());
	}

	private MusicDto convertToDto(Music Music) {
		MusicDto musicDto = modelMapper.map(Music, MusicDto.class);
		return musicDto;
	}
}
