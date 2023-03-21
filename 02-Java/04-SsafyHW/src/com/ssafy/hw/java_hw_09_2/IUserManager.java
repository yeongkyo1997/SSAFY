package com.ssafy.hw.java_hw_09_2;

public interface IUserManager {

	void add(User user);

	User[] getList();

	User[] getUsers();

	VipUser[] getVipUsers();

	// 예외를 던진다고 선언
	User[] searchByName(String name) throws NameNotFoundException;

	double getAgeAvg();

}
