<?php
/**
*Login API of RAHO for Android  Added By Rizwan 19/3/18 20:46
**/

require_once '../includes/dbConnect.inc.php';

$user_contact = trim($_GET['contact']);
$user_password = md5($_GET['password']);

/**
*Login Check Query Added By Rizwan 19/3/18 20:50
**/
$query = "SELECT * FROM users
WHERE contact='$user_contact' AND password='$user_password'
LIMIT 1";

$query_row = mysqli_fetch_assoc(mysqli_query($connection, $query));

if (isset($query_row)) {
	$success = 1;
	$user = array(
		'id'   => (int)$query_row['id'],
		'name' => trim($query_row['name']),
	);
} else {
	$success = 0;
	$user = null;
}

$response = array(
	'success' => (bool)$success,
	'user_id' => $user,
);

echo json_encode($response);


?>