package com.main;

public class MainClassImpl implements MainClass {

	@Override
	public long add(int x, int y) {
		return x + y;
	}

	@Override
	public long subtract(int x, int y) {
		return x - y;
	}

	@Override
	public long multiply(int x, int y) {
		return x * y;
	}

	@Override
	public long divide(int x, int y) {
		return x / y;
	}

	@Override
	public long square(int x) {
		return x * x;
	}
	
}
