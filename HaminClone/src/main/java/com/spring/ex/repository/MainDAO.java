package com.spring.ex.repository;

import java.util.List;

import com.spring.ex.domain.ProductVO;

public interface MainDAO {
	
	public List<ProductVO> mainList(); //���� ��ǰ ����
	public ProductVO shopSg(int gdsNum); //���� ��ǰ ���⿡�� �󼼺���
	public List<ProductVO> shopCate(); //���� ��ǰ ���⿡�� ī�װ�
	public List<ProductVO> shopCate2(); //���� ��ǰ ���⿡�� ī�װ�
	
}
