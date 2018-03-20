<?php
/**
* Error Handling Functions By Rizwwan 20/3/18 03:10
**/

/**
 * function to return json response
 * corresponding to a status code and message
 * @param  status_code 		default 200
 * @param  message 
 * @return message JSON object
 * By Rizwan 20/3/18 03:12
 */
function base_error($message, $status_code = 200) {
	//http_response_code($status_code);

	$response = array(
		"message" => $message,
	);

	return json_encode($response);
}

/**
 * function to return no results found error
 * @return JSON object with status code 204
 * By Rizwan 20/3/18 03:16
 */
function no_results_error() {
	$error = base_error("No results found!", 204);
	echo $error;
}

/**
 * function to return invalid parameters response
 * @return JSON object with status code 400
 * By Rizwan 20/3/18 03:18
 */
function invalid_parametes_error() {
	$error = base_error("Invlid parameters passed!", 400);
	echo $error;
}

