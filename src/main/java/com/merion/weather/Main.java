package com.merion.weather;

import com.merion.weather.dto.Current;
import com.merion.weather.dto.CurrentResponse;
import retrofit2.Response;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Block 4, Rest API");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter your city: ");

            String str = scanner.nextLine();

            if (str.equals("eX")) {
                System.out.println("\nXaXaXaaa!!!\n");
                break;
            }
            Response<CurrentResponse> response = WeatherService.instance().current(WeatherService.MY_API_KEY, str).execute();
            if (response.isSuccessful()) {
                Current current = response.body().getCurrent();
                System.out.println("Temper is " + current.getTempC() + " and fills like " + current.getFeelslikeC());
            } else {
                System.out.println("Chto to wronge!!!");
            }
        }

    }
}
