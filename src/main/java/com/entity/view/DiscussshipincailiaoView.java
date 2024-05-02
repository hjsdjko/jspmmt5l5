package com.entity.view;

import com.entity.DiscussshipincailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 食品材料评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
@TableName("discussshipincailiao")
public class DiscussshipincailiaoView  extends DiscussshipincailiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshipincailiaoView(){
	}
 
 	public DiscussshipincailiaoView(DiscussshipincailiaoEntity discussshipincailiaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussshipincailiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
