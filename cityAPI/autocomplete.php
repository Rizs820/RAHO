<?php

/**
*Autocomplete City Details File of RAHO for Android  Added By Rizwan 20/3/18 00:33
**/

require_once '../includes/dbConnect.inc.php';

$query_searched = trim($_GET['search']);
$final_response = array();

/**
*Fetch City Details Query By Rizwan 20/3/18 00:35
**/


$query = "SELECT `id`,`city_name` FROM `cities` WHERE `city_name` LIKE '%$query_searched%'
	ORDER BY CASE WHEN `city_name` like '$query_searched%' THEN 0
	WHEN `city_name` like '%$query_searched%' THEN 1 ELSE 2
	END, `city_name` LIMIT 10";

$query_run = mysqli_query($connection, $query);

while ($query_row = mysqli_fetch_assoc($query_run)) {
	$temp_array = array(
		'id'   => (int)$query_row['id'],
		'name' => ucwords(strtolower(trim($query_row['city_name']))),
	);

	array_push($final_response, $temp_array);
}

echo json_encode($final_response);
