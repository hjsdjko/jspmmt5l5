package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshipincailiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshipincailiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshipincailiaoView;


/**
 * 食品材料评论表
 *
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface DiscussshipincailiaoService extends IService<DiscussshipincailiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshipincailiaoVO> selectListVO(Wrapper<DiscussshipincailiaoEntity> wrapper);
   	
   	DiscussshipincailiaoVO selectVO(@Param("ew") Wrapper<DiscussshipincailiaoEntity> wrapper);
   	
   	List<DiscussshipincailiaoView> selectListView(Wrapper<DiscussshipincailiaoEntity> wrapper);
   	
   	DiscussshipincailiaoView selectView(@Param("ew") Wrapper<DiscussshipincailiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshipincailiaoEntity> wrapper);
   	

}

