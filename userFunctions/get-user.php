<?php
/**
* Get User Details API of RAHO for Android  Added By Rizwan 19/3/18 21:48
**/

require_once '../includes/dbConnect.inc.php';

$user_id = (int)$_GET['user'];
$final_response = array();

/**
* User Fecth Query By Rizwan  19/3/18 21:52
**/

$query = "SELECT `name`,`contact`
	FROM `users`
	WHERE `id`='$user_id'
	LIMIT 1";

$query_row = mysqli_fetch_assoc(mysqli_query($connection, $query));

if (isset($query_row)) {
	$final_response = array(
		'id'      => $user_id,
		'name'    => trim($query_row['name']),
		'contact' => trim($query_row['contact']),
	);
}

echo json_encode($final_response);
