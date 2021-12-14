package com.spring.ex.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.ex.domain.ProductVO;
import com.spring.ex.repository.MainDAO;

@Service
public class MainServiceImpl implements MainService {

	@Inject
	private MainDAO dao;
	
	@Override
	public List<ProductVO> mainList() {
		return dao.mainList();
	}
	
	@Override
	public ProductVO shopSg(int gdsNum) {
		return dao.shopSg(gdsNum);
	}
	
	@Override
	public List<ProductVO> shopCate() {
		return dao.shopCate();
	}
	
	@Override
	public List<ProductVO> shopCate2() {
		return dao.shopCate2();
	}
	
}
