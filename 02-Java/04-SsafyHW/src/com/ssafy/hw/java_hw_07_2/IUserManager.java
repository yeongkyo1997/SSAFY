package com.ssafy.hw.java_hw_07_2;

// 인터페이스 정의
public interface IUserManager {

	void add(User user);

	User[] getList();

	User[] getUsers();

	VipUser[] getVipUsers();

	User[] searchByName(String name);

	double getAgeAvg();

}
