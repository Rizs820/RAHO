<?php
/**
* Find Train API for Train Search By Rizwna 20/3/18 12:26
**/

	require_once 'includes/functions.inc.php';

	$train_api_code = "dl7pw92b38";
	$final_response = array();
$myfile = fopen("newfile.txt", "w") or die("Unable to open file!");
$txt = $_GET['src_city']." , ".$_GET['dest_city']." , ".$_GET['date'];
fwrite($myfile, $txt);
$txt = "Jane Doe\n";
fwrite($myfile, $txt);
fclose($myfile);

	if (isset($_GET['src_city']) && isset($_GET['dest_city']) && isset($_GET['date'])) {
		$source = strtolower(trim($_GET['src_city']));
		$destination = strtolower(trim($_GET['dest_city']));

		$src_url = 'http://api.railwayapi.com/v2/name-to-code/station/' . $source . '/apikey/' . $train_api_code . '/';
		echo $src_url;
		$response = json_decode(curl_url_call($src_url), true);
		$src_code = $response['stations'][0]['code'];
		//echo $src_code;
		$dest_url = 'http://api.railwayapi.com/v2/name-to-code/station/' . $destination . '/apikey/' . $train_api_code . '/';
		//echo $dest_url;
		$response = json_decode(curl_url_call($dest_url), true);
		$dest_code = $response['stations'][0]['code'];
		//echo $dest_code;
		$trains_url = 'http://api.railwayapi.com/v2/between/source/' . $src_code . '/dest/' . $dest_code . '/date/' . $_GET['date'] . '/apikey/' . $train_api_code . '/';
		$response = json_decode(curl_url_call($trains_url), true);
		//print_r($response);
		foreach ($response['trains'] as $train) {
			$temp_array = array(
				'train_number'   => $train['number'],
				'name'           => $train['name'],
				'departure_time' => $train['src_departure_time'],
				'arrival_time'   => $train['dest_arrival_time'],
			);

			$temp_array['days'] = array();

			foreach ($train['days'] as $day) {
				if (strtolower($day['runs']) === 'y') {
					array_push($temp_array['days'], 1);
				} else {
					array_push($temp_array['days'], 0);
				}
			}

			array_push($final_response, $temp_array);
		}
	}	

	echo json_encode(array('trains' => $final_response));
