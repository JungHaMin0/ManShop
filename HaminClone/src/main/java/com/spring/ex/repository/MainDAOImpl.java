package com.spring.ex.repository;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.ex.domain.ProductVO;

@Repository
public class MainDAOImpl implements MainDAO {

	@Inject 
	SqlSession sqlSession;
	
	@Override
	public List<ProductVO> mainList() {
		return sqlSession.selectList("MainMapper.MainList");
	}
	
	@Override
	public ProductVO shopSg(int gdsNum) {
		return sqlSession.selectOne("MainMapper.shopSg", gdsNum);
	}
	
	@Override
	public List<ProductVO> shopCate() {
		return sqlSession.selectList("MainMapper.mname");
	}
	
	@Override
	public List<ProductVO> shopCate2() {
		return sqlSession.selectList("MainMapper.sname");
	}
}
