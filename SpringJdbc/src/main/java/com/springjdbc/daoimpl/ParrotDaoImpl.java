package com.springjdbc.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.dao.ParrotDao;
import com.springjdbc.entity.Parrot;

import lombok.Data;

@Data
public class ParrotDaoImpl implements ParrotDao{

	private JdbcTemplate template;
	
	@Override
	public int insert(Parrot parrot) {
		
		String query="insert into parrot(color,speed,food) values(?,?,?)";
		int update = this.template.update(query,parrot.getColor(),parrot.getSpeed(),parrot.getFood());
		return update;
	}

	@Override
	public int update(Parrot parrot) {
 
		String query="update parrot set food=?, speed=? where id=?";
		int update = this.template.update(query,parrot.getFood(),parrot.getSpeed(),parrot.getId());
		return update;
	}

	@Override
	public int delete(int id) {

		String query="delete from parrot where id=?";
		int update = this.template.update(query,id);
		return update;
	}

	@Override
	public List<Parrot> fetch() {
		String query="select * from parrot";
		return template.query(query, new RowMapper<Parrot>(){

			@Override
			public Parrot mapRow(ResultSet rs, int rowNum) throws SQLException {
				Parrot parrot = new Parrot();
				parrot.setId(rs.getInt(1));
				parrot.setColor(rs.getString(2));
				parrot.setSpeed(rs.getString(3));
				parrot.setFood(rs.getString(4));
				return parrot;
			}
		 
		});
	}

	@Override
	public Parrot getParrot(int id) {
		
		String query="select * from parrot where id=?";
		return template.queryForObject(query, new RowMapper<Parrot>(){

			@Override
			public Parrot mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Parrot parrot = new Parrot();
				parrot.setId(rs.getInt(1));
				parrot.setColor(rs.getString(2));
				parrot.setSpeed(rs.getString(3));
				parrot.setFood(rs.getString(4));
				return parrot;
			}
			
		},id);
		
	}

}
