package com.turing.advancedse6.tdd;

import java.io.File;
import java.io.IOException;

public class FullFile extends File{

	public FullFile(String pathname) {
		super(pathname);
		// TODO Auto-generated constructor stub
	}
	public boolean createNewFile()throws IOException
	{
		throw new IOException("FullFile");
	}
}
