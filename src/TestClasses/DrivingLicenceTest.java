package TestClasses;

import java.util.Calendar;

import CarHireApp.DrivingLicence;
import CarHireApp.LicenceNumber;
import CarHireApp.Name;

public class DrivingLicenceTest {
	// The test class for the DrivingLicence class.
	public static void main(String[] args) {

		Calendar a, b, c, d, e, f, g, h, i, j;
		Name a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		LicenceNumber r, r1, r2, r3, r4, r5, r6, r7, r8, r9;
		DrivingLicence d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;

		a = new Calendar.Builder().setDate(1996, 8, 14).build();
		b = new Calendar.Builder().setDate(1985, 10, 1).build();
		c = new Calendar.Builder().setDate(1974, 3, 7).build();
		d = new Calendar.Builder().setDate(1995, 7, 21).build();
		e = new Calendar.Builder().setDate(1981, 1, 5).build();
		f = new Calendar.Builder().setDate(1973, 5, 14).build();
		g = new Calendar.Builder().setDate(1994, 9, 10).build();
		h = new Calendar.Builder().setDate(1992, 11, 3).build();
		i = new Calendar.Builder().setDate(1990, 2, 19).build();
		j = new Calendar.Builder().setDate(1983, 3, 19).build();

		a1 = new Name("Ivaylo", "Georgiev");
		a2 = new Name("Fernando", "Alonso");
		a3 = new Name("Steeven", "Gerrard");
		a4 = new Name("Michael", "Jackson");
		a5 = new Name("Oliver", "Nicolson");
		a6 = new Name("Raheem", "Sterling");
		a7 = new Name("Dimitar", "Berbatov");
		a8 = new Name("Silvester", "Stalone");
		a9 = new Name("Jack", "Daniels");
		a10 = new Name("Bob", "Marley");

		r = new LicenceNumber(a1, a);
		r1 = new LicenceNumber(a2, b);
		r2 = new LicenceNumber(a3, c);
		r3 = new LicenceNumber(a4, d);
		r4 = new LicenceNumber(a5, e);
		r5 = new LicenceNumber(a6, f);
		r6 = new LicenceNumber(a7, g);
		r7 = new LicenceNumber(a8, h);
		r8 = new LicenceNumber(a9, i);
		r9 = new LicenceNumber(a10, j);

		boolean full = true;

		d1 = new DrivingLicence(a1, a, b, r, full);
		d2 = new DrivingLicence(a2, b, a, r1, full);
		d3 = new DrivingLicence(a3, c, d, r2, full);
		d4 = new DrivingLicence(a4, d, f, r3, full);
		d5 = new DrivingLicence(a5, e, g, r4, full);
		d6 = new DrivingLicence(a6, f, j, r5, full);
		d7 = new DrivingLicence(a7, g, i, r6, full);
		d8 = new DrivingLicence(a8, h, c, r7, full);
		d9 = new DrivingLicence(a9, i, h, r8, full);
		d10 = new DrivingLicence(a10, j, j, r9, full);

		System.out.println(d1 + "\n\n" + d2 + "\n\n" + d3 + "\n\n" + d4 + "\n\n" + d5 + "\n\n" + d6 + "\n\n" + d7
				+ "\n\n" + d8 + "\n\n" + d9 + "\n\n" + d10);

	}

}
