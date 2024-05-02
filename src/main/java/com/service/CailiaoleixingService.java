package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CailiaoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CailiaoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CailiaoleixingView;


/**
 * 材料类型
 *
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface CailiaoleixingService extends IService<CailiaoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CailiaoleixingVO> selectListVO(Wrapper<CailiaoleixingEntity> wrapper);
   	
   	CailiaoleixingVO selectVO(@Param("ew") Wrapper<CailiaoleixingEntity> wrapper);
   	
   	List<CailiaoleixingView> selectListView(Wrapper<CailiaoleixingEntity> wrapper);
   	
   	CailiaoleixingView selectView(@Param("ew") Wrapper<CailiaoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CailiaoleixingEntity> wrapper);
   	

}

