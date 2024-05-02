package com.entity.view;

import com.entity.DiscussjiagonggongyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 加工工艺评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
@TableName("discussjiagonggongyi")
public class DiscussjiagonggongyiView  extends DiscussjiagonggongyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiagonggongyiView(){
	}
 
 	public DiscussjiagonggongyiView(DiscussjiagonggongyiEntity discussjiagonggongyiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiagonggongyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
