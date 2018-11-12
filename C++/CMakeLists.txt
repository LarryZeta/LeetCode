cmake_minimum_required(VERSION 3.10)
project(C++)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(C++
        "main.cpp"
        "definition/ListNode.h"
        "easy/1. Two Sum.cpp"
        "medium/2. Add Two Numbers.cpp"
        "easy/3. Longest Substring Without Repeating Characters.cpp"
        "hard/4. Median of Two Sorted Arrays.cpp"
        "medium/5. Longest Palindromic Substring.cpp"
        "medium/6. ZigZag Conversion.cpp"
        "easy/7. Reverse Integer.cpp"
        "medium/8. String to Integer (atoi).cpp"
        "easy/9. Palindrome Number.cpp"

        "medium/11. Container With Most Water.cpp"

        "medium/238. Product of Array Except Self .cpp"
        "easy/292. Nim Game.cpp" )
