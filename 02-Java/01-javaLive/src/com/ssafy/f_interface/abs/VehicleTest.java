package com.ssafy.f_interface.abs;

public class VehicleTest {
	public static void main(String[] args) {
		// TODO: DieselSUV와 ElectricCar를 각각 한대씩 관리하는배열을 만들고 사용해보자.
		Vehicle[] vehicles = { new DieselSUV(), new ElectricCar(), new HorseCart() };

		for (Vehicle v : vehicles) {
			v.reportPosition();
			v.addFuel();
		}
		// END:

		// Vehicle v = new Vehicle();
	}
}
