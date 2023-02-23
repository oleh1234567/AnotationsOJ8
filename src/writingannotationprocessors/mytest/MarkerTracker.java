package writingannotationprocessors.mytest;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MarkerTracker {
    public static void trackMarkers(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            Marker marker = m.getAnnotation(Marker.class);
            if (marker != null) {
                System.out.println("Found Marker: " + marker.id() + " : " + marker.description());
                useCases.remove(Integer.valueOf(marker.id()));
            }
        }
        useCases.forEach(i -> System.out.println("Missing markercase : " + i));
    }

    public static void main(String[] args) {
        List<Integer> useCases = IntStream.rangeClosed(6, 8)
                .boxed()
                .collect(Collectors.toList());
        trackMarkers(useCases, MarkerTest.class);
    }
}
