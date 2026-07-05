package day6_chapitre4_20062026.les_interfaces;

@FunctionalInterface
public interface Prediction {
public String test();

public default void info() {}

public static void infoInfo() {}
}
