package com.uber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// write your code here
        User user = new User("userId","email-Id","john","abc","1.0",
                UserType.REGULAR);
        System.out.println("Enter jpurney details");
        String des  = br.readLine().toLowerCase(Locale.ROOT);
        String carType = br.readLine().toString();

        Ride ride = new Ride(user.getUserId(), user.getLocation(), des,CarType.Regular,
                FeeStartegy.INDIA);

    }
}
