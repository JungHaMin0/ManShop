package com.spring.ex.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.ex.domain.ProductVO;
import com.spring.ex.service.MainService;

@Controller
public class MainController {
	
	@Inject 
	MainService mser;
	
	@RequestMapping(value = "index.do", method = RequestMethod.GET)
	public String getIndex(Model model) {
		model.addAttribute("mainlist", mser.mainList());
		return "boot/index";
	}
	
	@RequestMapping(value = "shop.do", method = RequestMethod.GET)
	public String getShop() {
		
		return "boot/shop";
	}
	
	@RequestMapping(value = "shopSingle.do", method = RequestMethod.GET)
	public String getShopSingle(@RequestParam("n") int gdsNum, Model model) {
		ProductVO pdt = mser.shopSg(gdsNum);
		model.addAttribute("shopsg", pdt);
		model.addAttribute("mname", mser.shopCate());
		model.addAttribute("sname", mser.shopCate2());
		return "boot/shop-single";
	}
	
}
