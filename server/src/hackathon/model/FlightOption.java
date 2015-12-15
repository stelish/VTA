package hackathon.model;

import java.math.BigDecimal;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class FlightOption implements PackageOption {

	private DateTime startDate;
	
	private DateTime endDate;
	
	private String originCode;
	
	private String destinationCode;
	
	private BigDecimal price;
	
	public FlightOption(String originCode, String destinationCode,
			DateTime startDate, DateTime endDate, BigDecimal price) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.originCode = originCode;
		this.destinationCode = destinationCode;
		this.price = price;
	}
	
	public BigDecimal getPrice() {
		return price;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public String getOriginCode() {
		return originCode;
	}

	public String getDestinationCode() {
		return destinationCode;
	}

	public boolean matchesPlaceAndDate(String placeCode, LocalDate date) {
		if (!endDate.toLocalDate().equals(date)) {
			return false;
		}
		return placeCode.equals(destinationCode);
	}
}
