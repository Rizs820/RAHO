<?php
/**
* Fecth All Cities By Rizwan 20/3/18 3:37:
**/

	require_once 'includes/dbConnect.inc.php';
	require_once 'includes/response_msg/errors.php';
//	require_once 'includes/response_msg/main.php';

	$response_array = array();

	$query = "SELECT `id`,`city_name`,`lat`,`lng`,`image` FROM `cities` ORDER BY `number_of_trips` DESC LIMIT 6";
	$query_run = mysqli_query($connection, $query);
	
	while ($query_row = mysqli_fetch_assoc($query_run)) {
		$image_url = trim($query_row['image']);
		
		$temp_array = array(
			'id'    => (int)$query_row['id'],
			'name'  => ucwords(strtolower($query_row['city_name'])),
			'lat'   => (float)$query_row['lat'],
			'lng'   => (float)$query_row['lng'],
			'image' => ($image_url === '') ? null : $image_url,
		);

		array_push($response_array, $temp_array);
	}

	if (empty($response_array)) {
	//	no_results_error();
	} else {
		echo json_encode(array('cities' => $response_array));
	}

?>