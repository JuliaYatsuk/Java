package com.justest.CarServices;

import java.io.IOException;

public enum CarState {
    DRIVING, PARKING, WAITING;

    public static CarState from(String state)  {
        switch (state) {
            case "DRIVING":
                return DRIVING;
            case "WAITING":
                return WAITING;
            case "PARKING":
                return PARKING;
            default:
                throw new RuntimeException("unknown state "+state);

        }
    }

}
