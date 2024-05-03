package com.dao;

import com.entity.ManhuahuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ManhuahuodongVO;
import com.entity.view.ManhuahuodongView;


/**
 * 漫画活动
 * 
 * @author 
 * @email 
 * @date 2022-04-13 11:40:48
 */
public interface ManhuahuodongDao extends BaseMapper<ManhuahuodongEntity> {
	
	List<ManhuahuodongVO> selectListVO(@Param("ew") Wrapper<ManhuahuodongEntity> wrapper);
	
	ManhuahuodongVO selectVO(@Param("ew") Wrapper<ManhuahuodongEntity> wrapper);
	
	List<ManhuahuodongView> selectListView(@Param("ew") Wrapper<ManhuahuodongEntity> wrapper);

	List<ManhuahuodongView> selectListView(Pagination page,@Param("ew") Wrapper<ManhuahuodongEntity> wrapper);
	
	ManhuahuodongView selectView(@Param("ew") Wrapper<ManhuahuodongEntity> wrapper);
	

}
