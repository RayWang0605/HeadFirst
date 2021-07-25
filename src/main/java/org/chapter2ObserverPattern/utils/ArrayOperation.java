package org.chapter2ObserverPattern.utils;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayOperation {
    public static float average(ArrayList<Float> arrayList) {
        float sum = 0;
        for (float num : arrayList) {
            sum += num;
        }
        return sum / arrayList.size();
    }

    public static float min(ArrayList<Float> arrayList) {
        if (arrayList != null) {
            return Collections.min(arrayList);
        }
        else {
            throw new NullPointerException("arrayList is null");
        }
    }

    public static float max(ArrayList<Float> arrayList) {
        if (arrayList != null) {
            return Collections.max(arrayList);
        }
        else {
            throw new NullPointerException("arrayList is null");
        }
    }
}
