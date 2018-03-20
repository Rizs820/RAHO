<?php
/**
* Add Trips Module of RAHO Added By Rizwan 20/3/18 00:48
**/
	require_once '../includes/dbConnect.inc.php';
	require_once '../includes/functions.inc.php';

	$response = array();

	$user_id         = (int)$_GET['user'];
	$trip_title      = trim($_GET['title']);
	$trip_start_time = (int)$_GET['start_time'];
	$trip_city       = (int)$_GET['city'];

/**
* Add Trip Query With End Time Check By Rizwan 20/03/18 00:52
**/
if($user_id==NULL)
{
	$success = 0;
}
else
{
	if (isset($_GET['end_time'])) {
		$trip_end_time = (int)$_GET['end_time'];
		$query = "INSERT INTO `trips` (`city_id`,`title`,`start_time`,`end_time`)
			VALUES ('$trip_city','$trip_title','$trip_start_time','$trip_end_time')";
	} else {
		$query = "INSERT INTO `trips` (`city_id`,`title`,`start_time`)
			VALUES ('$trip_city','$trip_title','$trip_start_time')";
	}

	if (mysqli_query($connection, $query)) {
		$trip_id = (int)mysqli_insert_id($connection);

		$query_ins = "INSERT INTO `trip_users` (`trip_id`,`user_id`)
			VALUES ('$trip_id', '$user_id')";

		if (mysqli_query($connection, $query_ins)) {
			$success = 1;
			increase_trip_count($connection, $trip_city);
		} else {
			$success = 0;
		}
	} else {
		$success = 0;
	}

	
}
$response['success'] = (bool)$success;
	echo json_encode($response);
