package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> {
            List<Integer> result = new ArrayList<>();
            for (Integer num : arg) {
                result.add(num / divider);
            }
            return result;
        };
    }
}
