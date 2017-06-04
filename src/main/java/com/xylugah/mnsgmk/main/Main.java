package com.xylugah.mnsgmk.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;

import com.xylugah.mnsgmk.entity.Issuance;
import com.xylugah.mnsgmk.entity.RosterItem;
import com.xylugah.mnsgmk.tools.FileFinder;
import com.xylugah.mnsgmk.tools.GlobalException;
import com.xylugah.mnsgmk.tools.XMLTool;

public class Main {

	private final static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		File[] files = getFiles();
		
		XMLTool tool = new XMLTool();

		List<Issuance> issuances = new ArrayList<>();
		try {
			for (File file : files) {
				Issuance issuance = (Issuance) tool.unMarshal(file);
				issuances.add(issuance);
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	/*	try {
			tool.marshal(new File("C:\\file.xml"), p);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

	public static File[] getFiles() {
		FileFinder finder = new FileFinder();
		File[] files = null;
		try {
			files = finder.getFileList("c:\\", ".xml");
		} catch (GlobalException e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return files;
	}
}
