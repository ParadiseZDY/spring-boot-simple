package com.sunny.dao.slave;

import com.sunny.domain.GmsConfig;

import java.util.List;

/**
 * 
 * 
 * @author Mr Zhao
 * @date 2018-04-16 12:20
 **/
public interface GmsConfigSlaveDao {

	GmsConfig selectByPrimaryKey(Integer id);

	Long selectObjectListPageTotal(GmsConfig gmsConfig);

	List<GmsConfig> selectObjectListPage(GmsConfig gmsConfig);

	List<GmsConfig> selectByObjectList(GmsConfig gmsConfig);

}
