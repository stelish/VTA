package hackathon;

import hackathon.data.Database;
import hackathon.model.Package;
import hackathon.model.PackageOption;
import hackathon.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.joda.time.LocalDate;

public class PackageFinder {
	
	public static Collection<Package> findPackages(LocalDate startDate, LocalDate endDate, String originCode, String destinationCode) {
		
		Collection<PackageOption> flightOptions = Database.findReturnFlightOptions(startDate, endDate, originCode, destinationCode);
		
		Collection<PackageOption> hotelOptions = Database.findHotelOptions(startDate, endDate, destinationCode);
		
		Collection<PackageOption> carOptions = Database.findCarOptions(startDate, endDate, destinationCode);
		
		List<Collection<PackageOption>> listOfPackageOptionLists = Arrays.asList(
				flightOptions, 
				hotelOptions,
				carOptions);
		
		// find all permutations of the options
		Collection<List<PackageOption>> permutations = CollectionUtils.permutations(listOfPackageOptionLists);
		
		// create packages
		Collection<Package> result = new ArrayList<Package>();
		for (List<PackageOption> list : permutations) {
			result.add(new Package(list));
		}
		return result;
	}
}
