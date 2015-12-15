package hackathon.data;

import hackathon.model.FlightOption;
import hackathon.model.PackageOption;
import hackathon.model.ReturnFlightPackageOption;
import hackathon.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.joda.time.LocalDate;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

public class Database {
	
	private static Predicate<PackageOption> createPlaceAndDateFilter(final String placeCode, final LocalDate date) {
		return new Predicate<PackageOption> () {
			public boolean apply(PackageOption input) {
				return input.matchesPlaceAndDate(placeCode, date);
			}
		};
	}

	public static Collection<PackageOption> findReturnFlightOptions(LocalDate startDate, LocalDate endDate, String originCode, String destinationCode) {
		// find all outbound flights that match (destination)
		Collection<FlightOption> outbound = Collections2.filter(FlightData.FLIGHTS, createPlaceAndDateFilter(destinationCode, startDate));
		
		// find all inbound flights that match (origin)
		Collection<FlightOption> inbound = Collections2.filter(FlightData.FLIGHTS, createPlaceAndDateFilter(originCode, endDate));
		
		// combine these options as return flight options
		List<Collection<FlightOption>> listOfCollections = Arrays.asList(outbound, inbound);
		
		// find all permutations of the options
		Collection<List<FlightOption>> permutations = CollectionUtils.permutations(listOfCollections);
		
		// create return flight options
		Collection<PackageOption> result = new ArrayList<PackageOption>();
		for (List<FlightOption> list : permutations) {
			FlightOption first = list.get(0);
			FlightOption second = list.get(1);
			result.add(new ReturnFlightPackageOption(first, second));
		}
		return result;
	}
	
	public static Collection<PackageOption> findCarOptions(LocalDate startDate, LocalDate endDate, String placeCode) {
		return Collections2.filter(CarData.CARS, createPlaceAndDateFilter(placeCode, null));
	}
	
	public static Collection<PackageOption> findHotelOptions(LocalDate startDate, LocalDate endDate, String placeCode) {
		return Collections2.filter(HotelData.HOTELS, createPlaceAndDateFilter(placeCode, null));
	}
}
