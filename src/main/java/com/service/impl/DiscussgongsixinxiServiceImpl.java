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


import com.dao.DiscussgongsixinxiDao;
import com.entity.DiscussgongsixinxiEntity;
import com.service.DiscussgongsixinxiService;
import com.entity.vo.DiscussgongsixinxiVO;
import com.entity.view.DiscussgongsixinxiView;

@Service("discussgongsixinxiService")
public class DiscussgongsixinxiServiceImpl extends ServiceImpl<DiscussgongsixinxiDao, DiscussgongsixinxiEntity> implements DiscussgongsixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgongsixinxiEntity> page = this.selectPage(
                new Query<DiscussgongsixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussgongsixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgongsixinxiEntity> wrapper) {
		  Page<DiscussgongsixinxiView> page =new Query<DiscussgongsixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgongsixinxiVO> selectListVO(Wrapper<DiscussgongsixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgongsixinxiVO selectVO(Wrapper<DiscussgongsixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgongsixinxiView> selectListView(Wrapper<DiscussgongsixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgongsixinxiView selectView(Wrapper<DiscussgongsixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
