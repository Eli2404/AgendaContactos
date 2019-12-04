package com.softtek.java.academy.util;

import java.util.UUID;

public class util {
	
public String generateId() {
	String uuid = UUID.randomUUID().toString();
	return uuid;
}
}
