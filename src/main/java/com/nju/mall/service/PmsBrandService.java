package com.nju.mall.service;

import java.util.List;


import com.nju.mall.mbg.model.PmsBrand;

public interface PmsBrandService {
	List<PmsBrand> listAllBrand();
	
	int createBrand(PmsBrand brand);
	
	int updateBrand(Long id,PmsBrand brand);
	
	int deleteBrand(Long id);
	
	List<PmsBrand> listBrand(int pageNum,int pageSize);
	
	PmsBrand getBrand(Long id);
}
