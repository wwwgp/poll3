package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Qq;
import com.briup.apps.poll.service.IQqService;

@RestController
@RequestMapping("/qq")

public class QqController {
	@Autowired
	private IQqService qqService;
	
	@GetMapping("findAllQq")
	public List<Qq> findAllQq(){
		List<Qq> list=new ArrayList<>();
		try {
			 list=qqService.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	@GetMapping("deleteQqById")
	public String deleteQqById(long id){
		try {
			 qqService.deleteById(id);
			 return "删除成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}
	
	@PostMapping("saveQq")
	public String saveQq(Qq qq){
		try {
			 qqService.save(qq);
			 return "保存成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
	}
	
	@PostMapping("updateQq")
	public String updateQq(Qq qq){
		try {
			 qqService.update(qq);
			 return "更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
	}

}
