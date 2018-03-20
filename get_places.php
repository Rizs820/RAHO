<?php
/**
* Find Places API By Rizwan 20/03/18 10:15
**/

require_once 'includes/functions.inc.php';
require_once 'includes/APIs.inc.php';
require_once 'includes/response_msg/main.php';
require_once 'includes/response_msg/errors.php';

//if (isset($_GET['lat']) && isset($_GET['lng']) && isset($_GET['mode'])) {
	if (isset($_GET['lat'])) {
	$response 	= array();
	$latitude 	= (float)$_GET['lat'];
	$longitude 	= (float)$_GET['lng'];

	//print("hi");

	if ($latitude !== 0 && $longitude !== 0) {
		$mode = (int)$_GET['mode'];
		//echo $mode;
		$response['mode']		= $HERE_API_MODES[$mode];
		$response['results'] 	= array();
		$here_api_url = "http://places.demo.api.here.com/places/v1/discover/explore";
		$here_api_url = $here_api_url
		. '?at=' . $latitude . '%2C' . $longitude
		. '&cat=' . $mode
		. '&app_id=' . HERE_APP_ID
		. '&app_code=' . HERE_APP_CODE;
		$limit=0;
	//echo $here_api_url;
	if ($limit !== 0) {
		$here_api_url .= '&size=' . $limit;
	}
	//echo $here_api_url;
	//$response = json_decode(file_get_contents($here_api_url), true);
	//$here_response = $response['results']['items'];
		$here_response = call_here_api($HERE_API_MODES[$mode], $latitude, $longitude);
		//echo gettype($response).$latitude." , ".$longitude;
	//print_r($here_response);
		if (empty($here_response)) {
			no_results_error();
		} else {
			foreach ($here_response as $item) {
				$temp_array = array(
					'name'    => strip_tags($item['title']),
					'lat'     => (float)$item['position'][0],
					'lng'     => (float)$item['position'][1],
					'address' => strip_tags($item['vicinity']),
					'phone'   => null,
					'website' => strip_tags($item['href']),
					'icon'    => strip_tags($item['icon']),
				);
				array_push($response['results'], $temp_array);
			}
			echo json_encode($response);
		}
	} else {
		// incorrect parameters passed
		invalid_parametes_error();

	}
} else {
	// incorrect parameters passed
	invalid_parametes_error();
	//print("hi");
}
