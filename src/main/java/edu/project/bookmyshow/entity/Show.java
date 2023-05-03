package edu.project.bookmyshow.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import edu.project.bookmyshow.enums.Genre;
import edu.project.bookmyshow.enums.ScreenAvailability;
import edu.project.bookmyshow.enums.ShowStatus;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Show {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long showId;
	private LocalTime showTime;
	private ShowStatus showStatus;
	
	private long movieId;
	private String movieNaame;
	private Genre genre;
	private LocalTime movieDuration;
	private String movieDescription;
	private String language;
	
	private long screenId;
	private String screenname;
	private ScreenAvailability screenAvailability;
	private double classicSeatPrice;
	private double goldSeatPrice;
	private double premiumSeatPrice;
	
	@ManyToOne 
	@JoinColumn
	private Theatre theatre;
	
}