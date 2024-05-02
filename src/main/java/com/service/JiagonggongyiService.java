package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiagonggongyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiagonggongyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiagonggongyiView;


/**
 * 加工工艺
 *
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface JiagonggongyiService extends IService<JiagonggongyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiagonggongyiVO> selectListVO(Wrapper<JiagonggongyiEntity> wrapper);
   	
   	JiagonggongyiVO selectVO(@Param("ew") Wrapper<JiagonggongyiEntity> wrapper);
   	
   	List<JiagonggongyiView> selectListView(Wrapper<JiagonggongyiEntity> wrapper);
   	
   	JiagonggongyiView selectView(@Param("ew") Wrapper<JiagonggongyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiagonggongyiEntity> wrapper);
   	

}

