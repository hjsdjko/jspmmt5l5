package com.entity.view;

import com.entity.CailiaoleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 材料类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
@TableName("cailiaoleixing")
public class CailiaoleixingView  extends CailiaoleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CailiaoleixingView(){
	}
 
 	public CailiaoleixingView(CailiaoleixingEntity cailiaoleixingEntity){
 	try {
			BeanUtils.copyProperties(this, cailiaoleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
