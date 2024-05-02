package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongsixinxiDao;
import com.entity.GongsixinxiEntity;
import com.service.GongsixinxiService;
import com.entity.vo.GongsixinxiVO;
import com.entity.view.GongsixinxiView;

@Service("gongsixinxiService")
public class GongsixinxiServiceImpl extends ServiceImpl<GongsixinxiDao, GongsixinxiEntity> implements GongsixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongsixinxiEntity> page = this.selectPage(
                new Query<GongsixinxiEntity>(params).getPage(),
                new EntityWrapper<GongsixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongsixinxiEntity> wrapper) {
		  Page<GongsixinxiView> page =new Query<GongsixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongsixinxiVO> selectListVO(Wrapper<GongsixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongsixinxiVO selectVO(Wrapper<GongsixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongsixinxiView> selectListView(Wrapper<GongsixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongsixinxiView selectView(Wrapper<GongsixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
