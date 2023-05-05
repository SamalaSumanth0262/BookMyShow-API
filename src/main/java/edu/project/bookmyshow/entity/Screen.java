package edu.project.bookmyshow.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import edu.project.bookmyshow.enums.ScreenType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Screen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long screenId;
	private String screenName;
	private ScreenType screenType;
	
	@OneToMany(mappedBy = "screen")
	List<Seat> seats;
	
	private int umberOfClassicSeat;
	private int numberOfGoldSeat;
	private int numberOfPlatinumSeat;
	
	@ManyToOne
	@JoinColumn
	private Theatre theatre;
}
