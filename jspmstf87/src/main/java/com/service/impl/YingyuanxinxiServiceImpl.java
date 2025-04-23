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


import com.dao.YingyuanxinxiDao;
import com.entity.YingyuanxinxiEntity;
import com.service.YingyuanxinxiService;
import com.entity.vo.YingyuanxinxiVO;
import com.entity.view.YingyuanxinxiView;

@Service("yingyuanxinxiService")
public class YingyuanxinxiServiceImpl extends ServiceImpl<YingyuanxinxiDao, YingyuanxinxiEntity> implements YingyuanxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingyuanxinxiEntity> page = this.selectPage(
                new Query<YingyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<YingyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingyuanxinxiEntity> wrapper) {
		  Page<YingyuanxinxiView> page =new Query<YingyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingyuanxinxiVO> selectListVO(Wrapper<YingyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingyuanxinxiVO selectVO(Wrapper<YingyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingyuanxinxiView> selectListView(Wrapper<YingyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingyuanxinxiView selectView(Wrapper<YingyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
