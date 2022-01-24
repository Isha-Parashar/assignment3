package com.example.assignment3.milestone.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.assignemnt3.milestone.service.MilestoneService;
import com.example.assignment3.milestone.model.Netflix;
import com.example.assignment3.milestone.repository.NetflixRepository;

//import com.univocity.parsers.common.record.Record;
//import com.univocity.parsers.csv.CsvParser;
//import com.univocity.parsers.csv.CsvParserSettings;

@RestController
public class MilestoneController {

	@Autowired
	NetflixRepository service;
	private MilestoneService milestoneService;

	@RequestMapping(value = "/allMovies", method = RequestMethod.GET)
	public List<Netflix> getAllMovies() {
		return milestoneService.getAllMovies();
	}
//
//	@GetMapping("/tvshows")
//	public List<Netflix> getTvShows(@RequestParam(required=false) Integer count,@RequestParam(required=false) String country,@RequestParam(required=false) String movieType,@RequestParam(required=false) String startDate,@RequestParam(required=false) String endDate) {
//		if(count!= null) {
//			return milestoneService.getTvShows(count);			
//		}
//		else if(country!=null) {
//			return milestoneService.getTvShowsByCountry(country);
//		}
//		else if(movieType!=null){
//			return milestoneService.getTvShowsByMovieType(movieType);
//		}
//		else if(startDate!=null && endDate!=null){
//			return milestoneService.getTvShowsByDate(startDate,endDate);
//		}
//		else {
//			return milestoneService.getAllMovies();
//		}
//	}
	
	
//	@PostMapping("/upload")
//	public String uploadedData(@RequestParam("file") MultipartFile file) throws Exception {
//		List<Netflix> movieList = new ArrayList<>();
//		InputStream inputStream = file.getInputStream();
//		CsvParserSettings setting = new CsvParserSettings();
//		setting.setHeaderExtractionEnabled(true);
//		CsvParser parser=new CsvParser(setting);
//		List<Record> parseAllRecords=parser.parseAllRecords(inputStream);
//		parseAllRecords.forEach(record -> {
//			Netflix row=new Netflix();
//			row.setShowId(record.getString("Show_id"));
//			row.setType(record.getString("type"));
//			row.setTitle(record.getString("title"));
//			row.setDirector(record.getString("director"));
//			row.setCast(record.getString("cast"));
//			row.setCountry(record.getString("country"));
//			row.setDateAdded(record.getString ("date_added"));
//			row.setReleaseYear(Integer.parseInt(record.getString("release_year")));
//			row.setRating(record.getString("rating"));
//			row.setDuration(record.getString("duration"));
//			row.setListedIn(record.getString("listed_in"));
//			row.setDescription(record.getString("description"));
//			movieList.add(row);
//		});
//		service.saveAll(movieList);
//		return "Uploaded Sucessfully";
//	}

}
