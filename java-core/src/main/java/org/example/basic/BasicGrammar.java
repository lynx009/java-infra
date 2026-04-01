package org.example.basic;

/**
 * Java 基础语法
 * Only record what I am not familiar with yet: @KeyWords, @Shift Operator.
 * @author lynx009
 * @date 2026-03-30
 */
public class BasicGrammar {
    public static void main(String[] args) {
        demonstrateKeywords();
        demonstrateShiftOperators();
    }

    /**
     * Demonstrates the usage of Java keywords.
     */
    public static void demonstrateKeywords() {
        String keywords = """
                abstract continue for new switch
                assert default goto package synchronized
                boolean do if private this
                break double implements protected throw
                byte else import public throws
                case enum instanceof return transient
                catch extends int short try
                char final interface static void
                class finally long strictfp volatile
                const float native super while""";
        System.out.println("Java Keywords:\n" + keywords);
    }

    /**
     * Demonstrates the usage of shift operators.
     */
    public static void demonstrateShiftOperators() {
        int value = 8;
        System.out.println("Original value: " + value);
        System.out.println("Right shift (>>): " + (value >> 1)); // 4
        System.out.println("Unsigned right shift (>>>): " + (value >>> 1)); // 4
        System.out.println("Left shift (<<): " + (value << 1)); // 16
    }
}
