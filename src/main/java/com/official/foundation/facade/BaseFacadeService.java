package com.official.foundation.facade;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.official.core.base.entity.Entity;
import com.official.core.base.search.support.Searchable;
/**
 * 所有接口都需要继承该接口 提供了一些DAO的基础操作
 * @author ShawnXII
 * @Version 1.0
 * @param <M>
 * @param <ID>
 */
public interface BaseFacadeService<M extends Entity<ID>, ID extends java.io.Serializable> {
	/**
	 * 保存单个实体
	 * 
	 * @param m
	 * @return
	 */
	public M save(M m);

	/**
	 * 批量保存实体
	 * 
	 * @param m
	 * @return
	 */
	public List<M> save(Collection<M> m);


	/**
	 * 根据主键删除相应实体
	 * 
	 * @param id
	 * @return
	 */
	public int delete(ID id);

	/**
	 * 删除实体
	 * 
	 * @param m
	 */
	public int delete(M m);

	/**
	 * 根据主键删除相应实体
	 * 
	 * @param ids
	 * @return
	 */
	public int delete(ID[] ids);

	/**
	 * 按照主键查询
	 * 
	 * @param id
	 * @return
	 */
	public M findOne(ID id);

	/**
	 * 是否存在实体
	 * 
	 * @param id
	 * @return
	 */
	public boolean exists(ID id);

	/**
	 * 统计实体总数
	 * 
	 * @return
	 */
	public long count();

	/**
	 * 查询所有实体
	 * 
	 * @return
	 */
	public List<M> findAll();
	/**
	 * 情况缓存数据
	 */
	public void flush();
}
