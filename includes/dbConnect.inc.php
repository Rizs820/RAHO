<?php
/**
*dbConnect File of RAHO for Android  Added By Rizwan 19/3/18 20:30
**/
$connect_error = 'Could not connect';
$mysql_host = 'localhost';
$mysql_user = '';//root
$mysql_pass = '';//password
$mysql_data = '';//DBName - raho
$connection = mysqli_connect($mysql_host , $mysql_user , $mysql_pass ,$mysql_data);
