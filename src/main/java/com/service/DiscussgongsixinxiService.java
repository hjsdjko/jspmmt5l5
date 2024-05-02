package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgongsixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgongsixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgongsixinxiView;


/**
 * 公司信息评论表
 *
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface DiscussgongsixinxiService extends IService<DiscussgongsixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgongsixinxiVO> selectListVO(Wrapper<DiscussgongsixinxiEntity> wrapper);
   	
   	DiscussgongsixinxiVO selectVO(@Param("ew") Wrapper<DiscussgongsixinxiEntity> wrapper);
   	
   	List<DiscussgongsixinxiView> selectListView(Wrapper<DiscussgongsixinxiEntity> wrapper);
   	
   	DiscussgongsixinxiView selectView(@Param("ew") Wrapper<DiscussgongsixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgongsixinxiEntity> wrapper);
   	

}

