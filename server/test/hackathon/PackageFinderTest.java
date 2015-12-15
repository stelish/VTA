package hackathon;

import static org.junit.Assert.*;
import hackathon.model.Package;

import java.util.Collection;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

public class PackageFinderTest {

	private static DateTimeFormatter FORMAT = DateTimeFormat.forPattern("yyyy-MM-dd");
	
	@Test
	public void testFindPackages() {
		LocalDate start = FORMAT.parseLocalDate("2016-01-03");
		LocalDate end = FORMAT.parseLocalDate("2016-01-05");
		
		Collection<Package> packages = PackageFinder.findPackages(start, end, "AKL", "WLG");
		
		assertFalse(packages.isEmpty());
	}
}
