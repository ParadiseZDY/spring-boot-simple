package com.sunny.service;

import com.sunny.dao.master.GmsConfigMasterDao;
import com.sunny.dao.slave.GmsConfigSlaveDao;
import com.sunny.domain.GmsConfig;
import com.sunny.rpc.IGmsConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 
 * 
 * @author Mr Zhao
 * @date 2018-04-16 12:20
 **/
@Service("gmsConfigService")
public class GmsConfigServiceImpl implements IGmsConfigService {

	private static Logger logger = LoggerFactory.getLogger(GmsConfigServiceImpl.class);

	@Resource
	private GmsConfigSlaveDao gmsConfigSlaveDao;
	@Resource
	private GmsConfigMasterDao gmsConfigMasterDao;

	@Override
	public GmsConfig selectByPrimaryKey(Integer id) {
		return gmsConfigSlaveDao.selectByPrimaryKey(id);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return gmsConfigMasterDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insertSelective(GmsConfig gmsConfig) {
		return gmsConfigMasterDao.insertSelective(gmsConfig);
	}

	@Override
	public int updateByPrimaryKeySelective(GmsConfig gmsConfig) {
		return gmsConfigMasterDao.updateByPrimaryKeySelective(gmsConfig);
	}

	@Override
	public int updateByPrimaryKey(GmsConfig gmsConfig) {
		return gmsConfigMasterDao.updateByPrimaryKey(gmsConfig);
	}

	@Override
	public Long selectObjectListPageTotal(GmsConfig gmsConfig) {
		return gmsConfigSlaveDao.selectObjectListPageTotal(gmsConfig);
	}

	@Override
	public List<GmsConfig> selectObjectListPage(GmsConfig gmsConfig) {
		return gmsConfigSlaveDao.selectObjectListPage(gmsConfig);
	}

	@Override
	public List<GmsConfig> selectByObjectList(GmsConfig gmsConfig){
		return gmsConfigSlaveDao.selectByObjectList(gmsConfig);
	}

}
