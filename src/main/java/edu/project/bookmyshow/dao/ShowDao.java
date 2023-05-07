package edu.project.bookmyshow.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.project.bookmyshow.entity.Show;
import edu.project.bookmyshow.repository.ShowRepo;

@Service
public class ShowDao {
	
	@Autowired
	private ShowRepo showRepo;
	
	public Show addShow(Show show) {
		return showRepo.save(show);
	}

	public Show getShow(long showId) {
		Optional<Show> optional = showRepo.findById(showId);
		if(optional.isEmpty()) {
			return null;
		}else {
			return optional.get();
		}
	}

	public List<Show> getShowsIfPresentBetween(LocalDateTime showStartTime, LocalDateTime showEndTime) {
		Optional<List<Show>> optional = showRepo.getShowsIfPresentBetween(showStartTime, showEndTime);
		if(optional.isEmpty()) {
			return null;
		}else {
			return optional.get();
		}
	}

	public Show cancelShow(Show show) {
		return showRepo.save(show);
	}
	
	public List<Show> getShowsByCity(String city){
		Optional<List<Show>> optional = showRepo.getShowsByCity(city);
		if(optional.isEmpty()) {
			return null;
		}else {
			return optional.get();
		}
	}
	
	public List<Show> getShowsByMovieId(long movieId){
		Optional<List<Show>> optional = showRepo.getShowsByMovieId(movieId);
		if(optional.isEmpty()) {
			return null;
		}else {
			return optional.get();
		}
	}
}
