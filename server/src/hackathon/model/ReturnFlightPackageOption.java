package hackathon.model;
import java.math.BigDecimal;

import org.joda.time.LocalDate;

public class ReturnFlightPackageOption implements PackageOption {
	
	private FlightOption outbound;
	
	private FlightOption inbound;
	
	public ReturnFlightPackageOption(FlightOption outbound, FlightOption inbound) {
		this.outbound = outbound;
		this.inbound = inbound;
	}

	/*
	private DateTime startDate;
	
	private DateTime endDate;
	
	private String originCode;
	
	private String destinationCode;
	
	private BigDecimal price;
	
	public ReturnFlightPackageOption(DateTime startDate, DateTime endDate,
			String originCode, String destinationCode, BigDecimal price) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.originCode = originCode;
		this.destinationCode = destinationCode;
		this.price = price;
	}
	*/
	
	public BigDecimal getPrice() {
		return inbound.getPrice().add(outbound.getPrice());
	}

	public boolean matchesPlaceAndDate(String placeCode, LocalDate date) {
		// not needed - ugly
		throw new UnsupportedOperationException();
	}

	public FlightOption getOutbound() {
		return outbound;
	}

	public FlightOption getInbound() {
		return inbound;
	}
}
