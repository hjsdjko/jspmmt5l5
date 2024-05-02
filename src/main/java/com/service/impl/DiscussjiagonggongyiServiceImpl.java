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


import com.dao.DiscussjiagonggongyiDao;
import com.entity.DiscussjiagonggongyiEntity;
import com.service.DiscussjiagonggongyiService;
import com.entity.vo.DiscussjiagonggongyiVO;
import com.entity.view.DiscussjiagonggongyiView;

@Service("discussjiagonggongyiService")
public class DiscussjiagonggongyiServiceImpl extends ServiceImpl<DiscussjiagonggongyiDao, DiscussjiagonggongyiEntity> implements DiscussjiagonggongyiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiagonggongyiEntity> page = this.selectPage(
                new Query<DiscussjiagonggongyiEntity>(params).getPage(),
                new EntityWrapper<DiscussjiagonggongyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiagonggongyiEntity> wrapper) {
		  Page<DiscussjiagonggongyiView> page =new Query<DiscussjiagonggongyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiagonggongyiVO> selectListVO(Wrapper<DiscussjiagonggongyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiagonggongyiVO selectVO(Wrapper<DiscussjiagonggongyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiagonggongyiView> selectListView(Wrapper<DiscussjiagonggongyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiagonggongyiView selectView(Wrapper<DiscussjiagonggongyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
