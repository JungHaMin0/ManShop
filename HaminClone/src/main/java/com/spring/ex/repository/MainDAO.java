package com.spring.ex.repository;

import java.util.List;

import com.spring.ex.domain.ProductVO;

public interface MainDAO {
	
	public List<ProductVO> mainList(); //메인 상품 보기
	public ProductVO shopSg(int gdsNum); //메인 상품 보기에서 상세보기
	public List<ProductVO> shopCate(); //메인 상품 보기에서 카테고리
	public List<ProductVO> shopCate2(); //메인 상품 보기에서 카테고리
	
}
