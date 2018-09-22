#!/bin/sh
set -uex
gcc -Wall main.c ToDo.c -o newToDo
rm tasks.txt
./newTodo -a todo 1
./newTodo -a todo 2
./newTodo -a todo 3
./newTodo -l
