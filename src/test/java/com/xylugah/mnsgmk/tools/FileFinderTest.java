package com.xylugah.mnsgmk.tools;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ExpectedException;

public class FileFinderTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetFileList() throws GlobalException{
		expectedException.expect(GlobalException.class);
		expectedException.expectMessage(JUnitMatchers.containsString("Invalid directory"));
		FileFinder finder = new FileFinder();
		finder.getFileList("", ".xml");
		
	}

}
