package hackathon.model;
import java.math.BigDecimal;

import org.joda.time.LocalDate;

public class HotelPackageOption implements PackageOption {

	private String name;
	
	private BigDecimal price;
	
	private String locationCode;

	public HotelPackageOption(String locationCode, String name, BigDecimal price) {
		this.name = name;
		this.price = price;
		this.locationCode = locationCode;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public boolean matchesPlaceAndDate(String placeCode, LocalDate date) {
		// ignore times
		return locationCode.equals(placeCode);
	}
}
