<?php
/**
*Login API of RAHO for Android  Added By Rizwan 19/3/18 21:13
**/

require_once '../includes/dbConnect.inc.php';

$user_name = trim($_GET['name']);
$user_contact = trim($_GET['contact']);
$user_password = md5($_GET['password']);
/**
* User Add Query By Rizwan  19/3/18 21:18
**/
if($user_name==NULL || $user_contact==NULL || $user_password==NULL)
{
	$response = array(
			'success' => (bool)0,
		);
}
else
{
	$query = "INSERT INTO `users` (`name`,`contact`,`password`)
		VALUES ('$user_name','$user_contact','$user_password')";

	if (mysqli_query($connection, $query)) {
		$response = array(
			'success' => (bool)1,
			'user_id' => (int)mysqli_insert_id($connection),
		);
	} else {
		$response = array(
			'success' => (bool)0,
		);
	}
}
	echo json_encode($response);


?>