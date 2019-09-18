/**
 * @Author name: Ivaylo Georgiev
 * @Author SN: B50445548
 * @Purpose: Project  - "Car hire application"
 */
package TestClasses;
import java.util.Calendar;

import CarHireApp.LicenceNumber;
import CarHireApp.Name;

//Test class for the  class.

public class LicenceNumberTest {
	public static void main(String[] args) {
		
		Calendar a,b,c,d,e,f,g,h,i,j;
		Name a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
		LicenceNumber r,r1,r2,r3,r4,r5,r6,r7,r8,r9;

		 a = new Calendar.Builder().setDate(1996, 12, 14).build();
		 b = new Calendar.Builder().setDate(1985, 10, 1).build();
		 c = new Calendar.Builder().setDate(1974, 3, 7).build();
		 d = new Calendar.Builder().setDate(1995, 1, 21).build();
		 e = new Calendar.Builder().setDate(1981, 1, 5).build();
		 f = new Calendar.Builder().setDate(1973, 5, 14).build();
		 g = new Calendar.Builder().setDate(1994, 9, 10).build();
		 h = new Calendar.Builder().setDate(1992, 11, 3).build();
		 i = new Calendar.Builder().setDate(1990, 2, 19).build();
		 j = new Calendar.Builder().setDate(1983, 2, 19).build();

		a1 = new Name("Ivaylo", "Georgiev");
		 a2 = new Name("Fernando", "Alonso");
		 a3 = new Name("Steeven", "Gerrard");
		 a4 = new Name("Michael", "Jackson");
		 a5 = new Name("Oliver", "Nicolson");
		 a6 = new Name("Raheem", "Sterling");
		 a7 = new Name("Dimitar", "Berbatov");
		 a8 = new Name("Silvester", "Stalone");
		 a9 = new Name("Jack", "Daniels");
		 a10 = new Name ("Bob","Marley");

		 r = new LicenceNumber (a1, a);
		 r1 = new  LicenceNumber (a2, b);
		 r2 = new  LicenceNumber (a3, c);
		 r3 = new LicenceNumber (a4, d);
		 r4 = new LicenceNumber (a5, e);
		 r5 = new LicenceNumber (a6, f);
		 r6 = new LicenceNumber (a7, g);
		 r7 = new LicenceNumber (a8, h);
		 r8 = new LicenceNumber (a9, i);
		 r9 = new LicenceNumber (a10,j);

		System.out.println(r+"\n"+r1+"\n"+r2+"\n"+r3+"\n"+r4+"\n"+r5+"\n"+r6+"\n"+r7+"\n"+r8+"\n"+r9);

	}
}