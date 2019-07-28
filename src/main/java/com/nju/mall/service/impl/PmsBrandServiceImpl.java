package com.nju.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.nju.mall.mbg.mapper.PmsBrandMapper;
import com.nju.mall.mbg.model.PmsBrand;
import com.nju.mall.mbg.model.PmsBrandExample;
import com.nju.mall.service.PmsBrandService;

public class PmsBrandServiceImpl implements PmsBrandService{
	
	@Autowired
	private PmsBrandMapper brandMapper;
	
	@Override
	public List<PmsBrand> listAllBrand() {
		// TODO Auto-generated method stub
		return brandMapper.selectByExample(new PmsBrandExample());
	}

	@Override
	public int createBrand(PmsBrand brand) {
		// TODO Auto-generated method stub
		return brandMapper.insertSelective(brand);
	}

	@Override
	public int updateBrand(Long id,PmsBrand brand) {
		// TODO Auto-generated method stub
		brand.setId(id);
		return brandMapper.updateByPrimaryKeySelective(brand);
	}

	@Override
	public int deleteBrand(Long id){
		return brandMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public List<PmsBrand> listBrand(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		brandMapper.selectByExample(new PmsBrandExample());
		return brandMapper.selectByExample(new PmsBrandExample());
	}

	@Override
	public PmsBrand getBrand(Long id) {
		// TODO Auto-generated method stub
		return brandMapper.selectByPrimaryKey(id);
	}

}
