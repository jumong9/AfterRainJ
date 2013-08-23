package org.rain.openapp.mBoard.dao;

import java.util.List;

import javax.sql.DataSource;

import org.rain.openapp.mBoard.domain.MBoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MBoardDaoImpl implements MBoardDao{

	private DataSource dataSource;
	private BeanPropertyRowMapper<MBoardVO> beanPropertyRowMapper;
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.beanPropertyRowMapper = new BeanPropertyRowMapper<MBoardVO>(MBoardVO.class);
	}
	
	@Override
	public List<MBoardVO> list() {
		
		String sql = "select code, num, title, contents, gen_usr_id, use_flag  from mboard";
		List<MBoardVO> list = jdbcTemplate.query(sql, this.beanPropertyRowMapper);
		return list;
	}

}
