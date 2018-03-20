<?php
/**
*Main Funtions of RAHO Added By Rizwan 19/3/18 20:38
**/

/**
*Websites & Phone Array for APIs
**/

$websites = ['http://www.saharastar.com/',
	'http://www.mumbai.grand.hyatt.com',
	'http://www.tridenthotels.com/mumbai_bandra_kurla/index.asp',
	'http://international.bawahotels.com'];
$phones = ['+912240851800',
	'+912261427328',
	'+912266761234',
	'+912266727777'];


/**
 * function to convert the passed timestamp to a human readable format
 * @param  integer 	$time 	timestamp
 * @return string 		 	desired time string
 * Added By Rizwan 19/3/18 20:40
 */
function get_timestamp($time) {
	return date('Y-m-d h:i:s', $time);
}

/**
 * function to make cURL calls
 * @param  string 	$url 	URL at which cURL call is to be made
 * @return string      		output string
 * Added By Rizwan 19/3/18 20:44
 */
function curl_url_call($url) {
	$ch = curl_init();
	curl_setopt($ch, CURLOPT_URL, $url);
	curl_setopt($ch, CURLOPT_HEADER, 0);
	curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1); 
	$output = curl_exec($ch);
	//echo $output."In Curl";
	curl_close($ch);
	
	return $output;
}

/**
 * function to get city weather details
 * from city name using openweathermap API
 * @param  string	$city_name
 * @return array
 * Added By Rizwan 19/3/18 23:21
 */
function get_city_weather($city_name) {
	$url = "http://api.openweathermap.org/data/2.5/weather?q=" . $city_name . "&APPID=" . OPENWEATHERMAP_API_KEY;
	$api_response = json_decode(curl_url_call($url), true);

	$return_array = array(
		'icon'        => "http://openweathermap.org/img/w/" . trim($api_response['weather'][0]['icon']) . ".png",
		'humidity'    => (float)$api_response['main']['humidity'],
		'temprature'  => (float)$api_response['main']['temp'] - 273.15,
		'description' => trim($api_response['weather'][0]['description']),
	);

	return $return_array;
}

/**
 * Here Places API called and response is returned
 * @param  array 	$params    
 * @param  float 	$latitude  
 * @param  float 	$longitude 
 * @param  integer 	$limit     
 * @return array
 * Added By Rizwan 19/3/18 23:45
 */
function call_here_api($params, $latitude, $longitude, $limit = 0) {
	$here_api_url = "http://places.demo.api.here.com/places/v1/discover/explore";

	$here_api_url = $here_api_url
		. '?at=' . $latitude . '%2C' . $longitude
		. '&cat=' . $params
		. '&app_id=' . HERE_APP_ID
		. '&app_code=' . HERE_APP_CODE;
	//echo $here_api_url;
	if ($limit !== 0) {
		$here_api_url .= '&size=' . $limit;
	}

	$response = json_decode(curl_url_call($here_api_url), true);
	//print_r(curl_url_call($here_api_url));
	//echo json_decode(curl_url_call($here_api_url), true);
	return $response['results']['items'];
}

/**
 * function to increase trip count for a city
 * @param  connection_object	$connection
 * @param  integer 				$city_id
 * @return boolean
 * Added By Rizwan 20/3/18 01:05
 **/
function increase_trip_count($connection, $city_id) {
	$query = "UPDATE `cities`
		SET `number_of_trips`=`number_of_trips`+1
		WHERE `id`='$city_id'";

	return (bool)mysqli_query($connection, $query);
}

/**
 * get monument ID from estimote beacon ID
 * @param  connection_object	$connection 
 * @param  string 				$beacon_id  
 * @return integer
 * By Rizwan 20/3/18 02:35
 */
function get_monument_id($connection, $beacon_id) {
	$monument_id = 0;
	
	$query = "SELECT `id`
		FROM `monuments_estimote`
		WHERE `major`='$beacon_id'
		LIMIT 1";
	$query_row = mysqli_fetch_assoc(mysqli_query($connection, $query));
	$monument_id = (int)$query_row['id'];
	
	return $monument_id;
}

/**
 * returns string which is safe for database
 * @param  string 	$text 
 * @return string 			encrypted string
 * By Rizwan 20/3/18 03:48
 */
function encrypt_text($text) {
	return strip_tags(addslashes($text));
}


/**
 * returns string which is safe for output
 * @param  string 	$text 
 * @return string 			decrypted string
 * By Rizwan 20/3/18 03:51
 */
function decrypt_text($text) {
	return stripcslashes($text);
}

/**
 * capitalize first letter for each city name
 * @param  string	$string 	city name 
 * @return string 				capatilized city name
 * By Rizwan 20/3/18 04:49 
 */
function change_city_name($string) {
	return ucwords(strtolower(trim($string)));
}

/**
 * get name of city from city ID
 * @param  connection_object	$connection
 * @param  integer				$city_id    
 * @return string 								city name
 * By Rizwan 20/3/18 04:56
 */
function get_city_name($connection, $city_id) {
	$query = "SELECT `city_name`
		FROM `cities`
		WHERE `id`='$city_id'
		LIMIT 1";

	return mysqli_fetch_assoc(mysqli_query($connection, $query));
}


/**
 * get coordinates of city from city ID
 * @param  connection_object	$connection
 * @param  integer				$city_id    
 * @return array 								lat, lng
 * By Rizwan 20/3/18 05:07
 */
function get_city_coordinates($connection, $city_id) {
	$query = "SELECT `lat`,`lng`
		FROM `cities`
		WHERE `id`='$city_id'
		LIMIT 1";

	return mysqli_fetch_assoc(mysqli_query($connection, $query));
}
/**
 * change strings to utf8 for json_encode
 * @param  string	$d
 * @return string	$d
 * By Rizwan 20/3/18 11:29
 */
function utf8ize($d) {
    if (is_array($d)) {
        foreach ($d as $k => $v) {
            $d[$k] = utf8ize($v);
        }
    } else if (is_string ($d)) {
        return utf8_encode($d);
    }
    return $d;
}
?>