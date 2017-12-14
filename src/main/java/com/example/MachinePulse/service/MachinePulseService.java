package com.example.MachinePulse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MachinePulse.dao.MachinePulseDao;

@Service
public class MachinePulseService {

	@Autowired
	MachinePulseDao soaDataDao;

	public String testService() {
		return soaDataDao.testService();
	}
	
}
