package cn.it.shop.dao;

import cn.it.shop.model.Forder;
import cn.it.shop.model.Product;
import cn.it.shop.model.Sorder;
import cn.it.shop.model.User;

public interface UserDao extends BaseDao<User> {

	public User login(User user);
}
