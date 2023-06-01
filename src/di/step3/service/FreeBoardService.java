package di.step3.service;

import di.step3.dao.DataBaseDriver;
import di.step3.dao.MysqlDriver;
import di.step3.dao.OracleDriver;

public class FreeBoardService {

	//디비연결
	//DataBaseDriver driver = new OracleDriver();
	//DataBaseDriver driver = new MysqlDriver();
	
	private DataBaseDriver driver;

	
	public FreeBoardService() {}
	public FreeBoardService(DataBaseDriver driver) {
		this.driver = driver;
	}
	
	public void insertBoard() {
		driver.getConnection();
	}
	
}
