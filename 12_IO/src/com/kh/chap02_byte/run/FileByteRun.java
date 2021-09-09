package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class FileByteRun {

	public static void main(String[] args) {
					
		FileByteDao dao = new FileByteDao();
		//import단축키 : control + shift + 5 누르면 바로 됨
		
			//dao.fileSave();	
			dao.fileRead();
		
	}

}
