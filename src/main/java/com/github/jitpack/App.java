package com.github.jitpack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("World!"));
    }

    public String greet(String name) {
        return "Hi " + name;
    }
}
