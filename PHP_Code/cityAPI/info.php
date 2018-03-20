<?php
/**
*City Info File of RAHO for Android  Added By Rizwan 19/3/18 22:50
**/

require_once '../includes/dbConnect.inc.php';
require_once '../includes/functions.inc.php';
require_once '../includes/APIs.inc.php';

$city_id = (int)$_GET['id'];
$response = array();

if ($city_id > 0) {
	$query = "SELECT `city_name`,`description`,`lat`,`lng`,`image`
		FROM `cities`
		WHERE `id`='$city_id'
		LIMIT 1";

	$query_row = mysqli_fetch_assoc(mysqli_query($connection, $query));

	if (isset($query_row)) {
		$city_name = ucfirst($query_row['city_name']);

		$response = array(
			'id'          => (int)$city_id,
			'name'        => $city_name,
			'description' => trim($query_row['description']),
			'lat'         => (float)$query_row['lat'],
			'lng'         => (float)$query_row['lng'],
			'image_url'   => trim($query_row['image'])
		);

		$response['weather'] = get_city_weather($city_name);
	}
}

//print_r($response);
echo json_encode($response);
