package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.service.IClazzService;

@RestController
@RequestMapping("/clazz")

public class ClazzController {
	@Autowired
	private IClazzService clazzService;
	@GetMapping("findAllClazz")
	public List<Clazz> findAllClazz(){
		List<Clazz> list=new ArrayList<>();
		try {
			list=clazzService.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	@GetMapping("deleteClazzById")
	public String deleteById(long id){
		try {
			 clazzService.deleteById(id);
			 return "删除成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}

	@PostMapping("saveClazz")
	public String save(Clazz clazz){
		try {
			 clazzService.save(clazz);
			 return "保存成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
	}
	
	@PostMapping("updateClazz")
	public String update(Clazz clazz){
		try {
			 clazzService.update(clazz);
			 return "更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
	}
}
