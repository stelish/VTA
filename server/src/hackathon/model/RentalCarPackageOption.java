package hackathon.model;
import java.math.BigDecimal;

import org.joda.time.LocalDate;

public class RentalCarPackageOption implements PackageOption {

	private String model;
	
	private BigDecimal price;
	
	private String locationCode;

	public RentalCarPackageOption(String locationCode, String model, BigDecimal price) {
		this.model = model;
		this.price = price;
		this.locationCode = locationCode;
	}

	public String getModel() {
		return model;
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
