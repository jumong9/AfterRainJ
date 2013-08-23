package org.rain.openapp.mBoard.dao;

import java.util.List;

import org.rain.openapp.mBoard.domain.MBoardVO;

public interface MBoardDao {

	public abstract List<MBoardVO> list();
}
