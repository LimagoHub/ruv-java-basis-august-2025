package de.spooler;

import de.office.Dokument;
import de.office.Excel;
import de.office.Word;

public class Spooler {

	public static void main(String[] args) {
		
		Dokument dokument = new Excel();
		dokument.drucken();

	}

}
