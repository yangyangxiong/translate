package com.translate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.translate.utils.Enchutils;
import com.translate.utils.GeoUtils;
import com.translate.vo.RespVo;

@Controller
@RequestMapping("/translate")
public class TranslateController {
	@RequestMapping("/geo")
	public @ResponseBody RespVo Geo(@RequestParam("lat")double lat,@RequestParam("lon")double lon) {
		RespVo vo = new RespVo();
		try {
				String Address = GeoUtils.letAndLen2AddrForbd(lat, lon);
				vo.setRetValue(Address);
			    vo.setRetStatus(1);
			
		} catch (Exception e) {
			vo.setRetStatus(0);
			vo.setErrMsg("服务器处理异常");
		}
		return vo;
	}
	@RequestMapping("/lower")
	public @ResponseBody RespVo Lower(@RequestParam("lower")String lower) {
		RespVo vo = new RespVo();
		try {
				String lowerresult = Enchutils.lowerto(lower);
				vo.setRetValue(lowerresult);
			    vo.setRetStatus(1);
			
		} catch (Exception e) {
			vo.setRetStatus(0);
			vo.setErrMsg("服务器处理异常");
		}
		return vo;
	}
	
	@RequestMapping("/upper")
	public @ResponseBody RespVo Upper(@RequestParam("upper")String upper) {
		RespVo vo = new RespVo();
		try {
				String upperresult = Enchutils.lowerto(upper);
				vo.setRetValue(upperresult);
			    vo.setRetStatus(1);
			
		} catch (Exception e) {
			vo.setRetStatus(0);
			vo.setErrMsg("服务器处理异常");
		}
		return vo;
	}
	
}
