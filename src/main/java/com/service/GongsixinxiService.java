package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongsixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongsixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongsixinxiView;


/**
 * 公司信息
 *
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface GongsixinxiService extends IService<GongsixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongsixinxiVO> selectListVO(Wrapper<GongsixinxiEntity> wrapper);
   	
   	GongsixinxiVO selectVO(@Param("ew") Wrapper<GongsixinxiEntity> wrapper);
   	
   	List<GongsixinxiView> selectListView(Wrapper<GongsixinxiEntity> wrapper);
   	
   	GongsixinxiView selectView(@Param("ew") Wrapper<GongsixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongsixinxiEntity> wrapper);
   	

}

