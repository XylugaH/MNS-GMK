package com.xylugah.mnsgmk.main;

import java.io.File;
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
		FileFinder finder = new FileFinder();
		try {
			File[] files = finder.getFileList("c:\\", ".prg");
			for (File file : files) {
				System.out.println(file.getAbsolutePath());
			}

		} catch (GlobalException e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}

		XMLTool tool = new XMLTool();
/*		try {
			Product product = new Product("","","","");
			tool.marshal(new File("C:\\file.xml"), product);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			Issuance p = (Issuance) tool.unMarshal(new File("C:\\invoice-400065292-2017-0000029847.xml"));
			List<RosterItem> rosterItem = p.getRoster().getRosterItem();
			for (RosterItem rosterItem2 : rosterItem) {
				System.out.println(rosterItem2.getCost());
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
