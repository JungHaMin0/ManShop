package com.spring.ex.service;

import java.util.List;

import com.spring.ex.domain.ProductVO;

public interface MainService {
	
	public List<ProductVO> mainList();
	public ProductVO shopSg(int gdsNum);
	public List<ProductVO> shopCate();
	public List<ProductVO> shopCate2();
	
}
