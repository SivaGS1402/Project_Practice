package com.helper;

import java.io.IOException;

public class Data_Reader_Manager {

	private Data_Reader_Manager() {

	}

	public static Data_Reader_Manager getInstanceDRM() {

		Data_Reader_Manager drm = new Data_Reader_Manager();
		return drm;
	}
	public static Data_Reader getInstance() throws IOException  {
		Data_Reader dr = new Data_Reader();
		return dr;

	}

}
