package com.ssafy.self.food.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.self.food.model.Food;
import com.ssafy.self.food.util.DBUtil;

public class FoodDaoImpl implements FoodDao {
	private static FoodDao foodDao = new FoodDaoImpl();
	private DBUtil DBUtil;

	private FoodDaoImpl() {
	}

	public static FoodDao getInstance() {
		return foodDao;
	}

	@Override
	public List<Food> selectFood() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertFood(Food food) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFood(int no) throws SQLException {
		// TODO Auto-generated method stub

	}

}
