cmake_minimum_required(VERSION 3.10)
project(C__)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(C__
        "main.cpp"
        "definition/ListNode.h"
        "easy/1. Two Sum.cpp"
        "easy/3. Longest Substring Without Repeating Characters.cpp"
        "easy/7. Reverse Integer.cpp"
        "easy/9. Palindrome Number.cpp"
        "medium/2. Add Two Numbers.cpp"
        "medium/5. Longest Palindromic Substring.cpp"
        "medium/6. ZigZag Conversion.cpp"
        "medium/11. Container With Most Water.cpp")
