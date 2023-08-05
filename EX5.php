<?php
$greeting = array();
$greeting[0] = "Hello, how are you? ";
$greeting[1] = "Hi, how are you? ";
$greeting[2] = "Welcome to my page";
$greeting[3] = "Good Morning";
$greeting[4] = "Good evening";
$n = mt_rand(0, 4);
echo $greeting [$n];
?>

