package com.xylugah.mnsgmk.tools;

public class GlobalException extends Exception {
	private static final long serialVersionUID = -2858170417418144623L;

	public GlobalException(String msg) {
		super(msg);
	}

	public GlobalException(Throwable ex) {
		super(ex);
	}

	public GlobalException(String msg, Throwable ex) {
		super(msg, ex);
	}
}
