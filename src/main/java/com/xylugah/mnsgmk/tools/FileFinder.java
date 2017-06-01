package com.xylugah.mnsgmk.tools;

import java.io.File;
import java.io.FilenameFilter;

import org.apache.log4j.Logger;

public class FileFinder {

	private final static Logger logger = Logger.getLogger(FileFinder.class);

	public File[] getFileList(final String dir, final String ext) throws GlobalException {
		if (ext == null || ext.isEmpty()) {
			String message = new StringBuilder().append("Invalid file extension ").append(ext).append(".").toString();
			logger.error(message);
			throw new GlobalException(message);
		}

		File directory = new File(dir);
		if (!validDir(directory)) {
			String message = new StringBuilder().append("Invalid directory ").append(dir).append(".").toString();
			logger.error(message);
			throw new GlobalException(message);
		}

		GenericExtFilter filter = new GenericExtFilter(ext);

		File[] result = directory.listFiles(filter);

		return result;
	}

	private boolean validDir(final File dir) {
		if (!dir.exists() || !dir.isDirectory()) {
			return false;
		}
		return true;
	}

	public class GenericExtFilter implements FilenameFilter {

		private String ext;

		public GenericExtFilter(String ext) {
			this.ext = ext;
		}

		public boolean accept(File dir, String name) {
			return (name.endsWith(ext));
		}
	}
}
