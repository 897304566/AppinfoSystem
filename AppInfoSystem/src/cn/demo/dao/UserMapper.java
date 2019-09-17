package cn.demo.dao;
/**
 * 
 * @author lxh
 *
 */

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.demo.entity.User;

@Repository("userMapper")
public interface UserMapper {
	/**
	 * 查询用户，可查询所有或根据条件查询
	 * @param user
	 * @return
	 */
	public List<User> getUserList(User user);
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public Integer addUser(User user);
	
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	public Integer updateUser(User user);
	
	/**
	 * 根据主键获取用户
	 * @param id
	 * @return
	 */
	public User getUserById(Integer id);
	
	/**
	 * 校验UserCode是否存在
	 * @param userCode
	 * @return
	 */
	public User checkUserCode(String userCode);
	
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	public User login(User user);
	
	
}
