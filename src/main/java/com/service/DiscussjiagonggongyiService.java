package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiagonggongyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiagonggongyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiagonggongyiView;


/**
 * 加工工艺评论表
 *
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface DiscussjiagonggongyiService extends IService<DiscussjiagonggongyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiagonggongyiVO> selectListVO(Wrapper<DiscussjiagonggongyiEntity> wrapper);
   	
   	DiscussjiagonggongyiVO selectVO(@Param("ew") Wrapper<DiscussjiagonggongyiEntity> wrapper);
   	
   	List<DiscussjiagonggongyiView> selectListView(Wrapper<DiscussjiagonggongyiEntity> wrapper);
   	
   	DiscussjiagonggongyiView selectView(@Param("ew") Wrapper<DiscussjiagonggongyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiagonggongyiEntity> wrapper);
   	

}

