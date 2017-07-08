package net.wjd.service.impl;

import java.io.Serializable;

import net.wjd.dao.IBaseDao;
import net.wjd.service.IBaseService;

public class BaseServiceImpl<T, PK extends Serializable> implements IBaseService<T, PK> {
	
	private IBaseDao<T, PK> baseDao;  
    
    public IBaseDao<T, PK> getBaseDao() {  
        return baseDao;  
    }  
      
    public void setBaseDao(IBaseDao<T, PK> baseDao) {  
        this.baseDao = baseDao;  
    }  
  
    public T get(PK id) {  
        return baseDao.get(id);  
    }  
      
    public PK save(T entity) {  
        return baseDao.save(entity);  
    } 

}
