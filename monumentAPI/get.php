<?php
/**
* Fetch Monuments Module of RAHO Added By Rizwan 20/3/18 03:13
**/
	require_once '../includes/dbConnect.inc.php';
	require_once '../includes/functions.inc.php';

	$final_response = array();
	
	if (isset($_GET['id'])) {
		$beacon_id = (int)$_GET['id'];
		$monument_id = get_monument_id($connection, $beacon_id);

		$query = "SELECT M.monument_name, M.monument_description, M.monument_image, C.city_name, M.city_id
			FROM `monuments` M INNER JOIN `cities` C ON M.city_id = C.id
			WHERE M.monument_id='$monument_id'
			LIMIT 1";

		$query_row = mysqli_fetch_assoc(mysqli_query($connection, $query));
		$query_row['monument_description'] = decrypt_text($query_row['monument_description']);

		$final_response = $query_row;
	}

	echo json_encode($final_response);
