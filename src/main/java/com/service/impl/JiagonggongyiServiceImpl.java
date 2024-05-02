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


import com.dao.JiagonggongyiDao;
import com.entity.JiagonggongyiEntity;
import com.service.JiagonggongyiService;
import com.entity.vo.JiagonggongyiVO;
import com.entity.view.JiagonggongyiView;

@Service("jiagonggongyiService")
public class JiagonggongyiServiceImpl extends ServiceImpl<JiagonggongyiDao, JiagonggongyiEntity> implements JiagonggongyiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiagonggongyiEntity> page = this.selectPage(
                new Query<JiagonggongyiEntity>(params).getPage(),
                new EntityWrapper<JiagonggongyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiagonggongyiEntity> wrapper) {
		  Page<JiagonggongyiView> page =new Query<JiagonggongyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiagonggongyiVO> selectListVO(Wrapper<JiagonggongyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiagonggongyiVO selectVO(Wrapper<JiagonggongyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiagonggongyiView> selectListView(Wrapper<JiagonggongyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiagonggongyiView selectView(Wrapper<JiagonggongyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
