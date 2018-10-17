package com.sunny.dao.master;

import com.sunny.domain.GmsConfig;

/**
 * 
 * 
 * @author Mr Zhao
 * @date 2018-04-16 12:20
 **/
public interface GmsConfigMasterDao {

	int deleteByPrimaryKey(Integer id);

	int insertSelective(GmsConfig gmsConfig);

	int updateByPrimaryKeySelective(GmsConfig gmsConfig);

	int updateByPrimaryKey(GmsConfig gmsConfig);

}
