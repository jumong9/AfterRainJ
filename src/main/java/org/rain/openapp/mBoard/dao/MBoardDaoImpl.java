package org.rain.openapp.mBoard.dao;

import java.util.List;

import javax.sql.DataSource;

import org.rain.openapp.mBoard.domain.MBoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MBoardDaoImpl implements MBoardDao{

	private DataSource dataSource;
	private BeanPropertyRowMapper<MBoardVO> beanPropertyRowMapper;
	private JdbcTemplate jdbcTemplate, jdbcTemplateWolf;
	
	@Autowired
	public void setDataSource(DataSource dataSource, DataSource dataSourceWolf){
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
		this.dataSource = dataSourceWolf;
		this.jdbcTemplateWolf = new JdbcTemplate(dataSourceWolf);
		
		this.beanPropertyRowMapper = new BeanPropertyRowMapper<MBoardVO>(MBoardVO.class);
	}
	
	@Override
	public List<MBoardVO> list() {
		
		String sql = "select code, num, title, contents, gen_usr_id, use_flag  from mboard";
		List<MBoardVO> list = jdbcTemplate.query(sql, this.beanPropertyRowMapper);
		List<MBoardVO> list2 = jdbcTemplateWolf.query(sql, this.beanPropertyRowMapper);
		list.addAll(list2);
		return list;
	}

}
