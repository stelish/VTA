package hackathon.model;
import java.math.BigDecimal;

import org.joda.time.LocalDate;

public interface PackageOption {
	
	BigDecimal getPrice();
	
	boolean matchesPlaceAndDate(String placeCode, LocalDate date);

}
