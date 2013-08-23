package org.rain.openapp.mBoard.service;

import java.util.List;

import org.rain.openapp.mBoard.dao.MBoardDao;
import org.rain.openapp.mBoard.domain.MBoardVO;
import org.springframework.beans.factory.annotation.Autowired;

public class MBoardServiceImpl implements MBoardService {

	@Autowired
	private MBoardDao mBoardDao;
	
	@Override
	public List<MBoardVO> list() {
		return null;
	}

}
