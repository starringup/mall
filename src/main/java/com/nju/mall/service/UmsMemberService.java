package com.nju.mall.service;

import com.nju.mall.common.api.CommonResult;

public interface UmsMemberService {
	CommonResult generateAuthCode(String telephone);
	
	CommonResult verifyAuthCode(String telephone,String authCode);
}
